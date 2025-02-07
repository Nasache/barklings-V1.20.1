package net.nathan.barklings.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.block.Blocks;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.nathan.barklings.block.ModBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(RabbitEntity.class)
public abstract class RabbitEntityMixin {

    @ModifyArgs(
            method = "initGoals",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/entity/ai/goal/TemptGoal;<init>(Lnet/minecraft/entity/mob/PathAwareEntity;DLnet/minecraft/recipe/Ingredient;Z)V"
            )
    )
    private void modifyTemptGoalIngredient(Args args) {
        Ingredient newIngredient = Ingredient.ofItems(
                Items.CARROT,
                Items.GOLDEN_CARROT,
                Blocks.DANDELION.asItem(),
                ModBlocks.CLOVER_CARPET.asItem()
        );
        args.set(2, newIngredient);
    }

    @ModifyReturnValue(method = "isTempting", at = @At("RETURN"))
    private static boolean modifyIsTempting(boolean original, ItemStack stack) {
        return original || stack.isOf(ModBlocks.CLOVER_CARPET.asItem());
    }
}