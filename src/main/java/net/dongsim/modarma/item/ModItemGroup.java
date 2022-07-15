package net.dongsim.modarma.item;

import net.dongsim.modarma.ModernArmaments;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup Firearms = FabricItemGroupBuilder.build(
            new Identifier(ModernArmaments.MOD_ID, "firearms"), () -> new ItemStack(ModItems.AK47));

}
