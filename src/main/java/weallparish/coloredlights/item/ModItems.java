package weallparish.coloredlights.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import weallparish.coloredlights.ColoredLightMod;
import weallparish.coloredlights.block.ModBlocks;

public class ModItems {
    public static final Item COPPER_TORCH = registerTorchItem("copper_torch", ModBlocks.COPPER_TORCH, ModBlocks.COPPER_WALL_TORCH);
    public static final Item DECORATIVE_REDSTONE_TORCH = registerTorchItem("decorative_redstone_torch", ModBlocks.DECORATIVE_REDSTONE_TORCH, ModBlocks.DECORATIVE_REDSTONE_WALL_TORCH);
    public static final Item CALCIUM_TORCH = registerTorchItem("calcium_torch", ModBlocks.CALCIUM_TORCH, ModBlocks.CALCIUM_WALL_TORCH);
    public static final Item SCULK_TORCH = registerTorchItem("sculk_torch", ModBlocks.SCULK_TORCH, ModBlocks.SCULK_WALL_TORCH);
    public static final Item END_TORCH = registerTorchItem("end_torch", ModBlocks.END_TORCH, ModBlocks.END_WALL_TORCH);
    public static final Item GOLD_TORCH = registerTorchItem("gold_torch", ModBlocks.GOLD_TORCH, ModBlocks.GOLD_WALL_TORCH);
    public static final Item MOSS_TORCH = registerTorchItem("moss_torch", ModBlocks.MOSS_TORCH, ModBlocks.MOSS_WALL_TORCH);
    public static final Item PRISMARINE_TORCH = registerTorchItem("prismarine_torch", ModBlocks.PRISMARINE_TORCH, ModBlocks.PRISMARINE_WALL_TORCH);
    public static final Item LAPIS_TORCH = registerTorchItem("lapis_torch", ModBlocks.LAPIS_TORCH, ModBlocks.LAPIS_WALL_TORCH);
    public static final Item CRYING_OBSIDIAN_TORCH = registerTorchItem("crying_obsidian_torch", ModBlocks.CRYING_OBSIDIAN_TORCH, ModBlocks.CRYING_OBSIDIAN_WALL_TORCH);
    public static final Item CORAL_TORCH = registerTorchItem("coral_torch", ModBlocks.CORAL_TORCH, ModBlocks.CORAL_WALL_TORCH);
    public static final Item MYCELIUM_TORCH = registerTorchItem("mycelium_torch", ModBlocks.MYCELIUM_TORCH, ModBlocks.MYCELIUM_WALL_TORCH);
    public static final Item COAL_TORCH = registerTorchItem("coal_torch", ModBlocks.COAL_TORCH, ModBlocks.COAL_WALL_TORCH);
    public static final Item DEBRIS_TORCH = registerTorchItem("debris_torch", ModBlocks.DEBRIS_TORCH, ModBlocks.DEBRIS_WALL_TORCH);

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ColoredLightMod.MOD_ID, name), item);
    }

    private static Item registerTorchItem(String name, Block torch, Block wallTorch) {
        return Registry.register(Registries.ITEM, new Identifier(ColoredLightMod.MOD_ID, name),
                new VerticallyAttachableBlockItem(torch, wallTorch, new FabricItemSettings(), Direction.DOWN));
    }

    private static void itemGroupFunctionalBlocks(FabricItemGroupEntries entries) {
        entries.addAfter(Items.TORCH, PRISMARINE_TORCH);
        entries.addAfter(Items.TORCH, MOSS_TORCH);
        entries.addAfter(Items.TORCH, COPPER_TORCH);
        entries.addAfter(Items.TORCH, GOLD_TORCH);
        entries.addAfter(Items.TORCH, DECORATIVE_REDSTONE_TORCH);

        entries.addAfter(Items.SOUL_TORCH, DEBRIS_TORCH);
        entries.addAfter(Items.SOUL_TORCH, SCULK_TORCH);
        entries.addAfter(Items.SOUL_TORCH, COAL_TORCH);
        entries.addAfter(Items.SOUL_TORCH, MYCELIUM_TORCH);
        entries.addAfter(Items.SOUL_TORCH, CALCIUM_TORCH);
        entries.addAfter(Items.SOUL_TORCH, CORAL_TORCH);
        entries.addAfter(Items.SOUL_TORCH, END_TORCH);
        entries.addAfter(Items.SOUL_TORCH, CRYING_OBSIDIAN_TORCH);
        entries.addAfter(Items.SOUL_TORCH, LAPIS_TORCH);
        entries.addAfter(Items.SOUL_TORCH, PRISMARINE_TORCH);

        entries.addAfter(Items.LANTERN,ModBlocks.PRISMARINE_LANTERN);
        entries.addAfter(Items.LANTERN,ModBlocks.MOSS_LANTERN);
        entries.addAfter(Items.LANTERN,ModBlocks.COPPER_LANTERN);
        entries.addAfter(Items.LANTERN,ModBlocks.GOLD_LANTERN);
        entries.addAfter(Items.LANTERN,ModBlocks.DECORATIVE_REDSTONE_LANTERN);

        entries.addAfter(Items.SOUL_LANTERN,ModBlocks.DEBRIS_LANTERN);
        entries.addAfter(Items.SOUL_LANTERN,ModBlocks.SCULK_LANTERN);
        entries.addAfter(Items.SOUL_LANTERN,ModBlocks.COAL_LANTERN);
        entries.addAfter(Items.SOUL_LANTERN,ModBlocks.MYCELIUM_LANTERN);
        entries.addAfter(Items.SOUL_LANTERN,ModBlocks.CALCIUM_LANTERN);
        entries.addAfter(Items.SOUL_LANTERN,ModBlocks.CORAL_LANTERN);
        entries.addAfter(Items.SOUL_LANTERN,ModBlocks.END_LANTERN);
        entries.addAfter(Items.SOUL_LANTERN,ModBlocks.CRYING_OBSIDIAN_LANTERN);
        entries.addAfter(Items.SOUL_LANTERN,ModBlocks.LAPIS_LANTERN);
        entries.addAfter(Items.SOUL_LANTERN,ModBlocks.PRISMARINE_LANTERN);
    }

    public static void registerModItems() {
        ColoredLightMod.LOGGER.info("Registering Mod Items for " + ColoredLightMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::itemGroupFunctionalBlocks);
    }
}
