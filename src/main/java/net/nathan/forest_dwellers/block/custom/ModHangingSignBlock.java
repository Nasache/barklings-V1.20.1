package net.nathan.forest_dwellers.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.HangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.nathan.forest_dwellers.block.entity.ModHangingSignBlockEntity;

public class ModHangingSignBlock extends HangingSignBlock {
    public ModHangingSignBlock(WoodType woodType, Settings settings) {
        super(woodType, settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ModHangingSignBlockEntity(pos, state);
    }
}