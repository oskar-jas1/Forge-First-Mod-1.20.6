package net.o.tutorialmod.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.o.tutorialmod.util.ModTags;

public class ModToolTiers {
    public static final Tier SAPPHIRE = new ForgeTier(1500, 5f, 4f, 25, ModTags.Blocks.NEEDS_SAPPHIRE_TOOL,
            () -> Ingredient.of(ModItems.SAPPHIRE.get()), null);



}
