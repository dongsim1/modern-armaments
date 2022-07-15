package net.dongsim.modarma.item;


import net.dongsim.modarma.ModernArmaments;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item AK47 = registerItem("ak47",
            new Item(new FabricItemSettings().group(ModItemGroup.Firearms)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ModernArmaments.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ModernArmaments.LOGGER.debug("Registering Mod Items for " + ModernArmaments.MOD_ID);
    }
}
