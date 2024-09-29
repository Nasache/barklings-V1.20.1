package net.nathan.barklings.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHERRIES = new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).build();
    public static final FoodComponent BANANA = new FoodComponent.Builder().hunger(5).saturationModifier(0.4F).build();
    public static final FoodComponent ORANGE = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).build();
    public static final FoodComponent POMEGRANATE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent PEAR = new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).build();
    public static final FoodComponent PLUM = new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).build();
    public static final FoodComponent STARFRUIT = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).build();

    public static final FoodComponent WARPED_MANGO = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent CRIMSON_DURIAN = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build();

    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).build();
    public static final FoodComponent GRAPES = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent BLUEBERRY = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
}
