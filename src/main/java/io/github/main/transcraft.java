package io.github.main;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class transcraft implements ModInitializer {

    // Sets up an item group for the mod
    public static final ItemGroup transcraftItemGroup = FabricItemGroupBuilder.build(
            new Identifier("transcraft", "general"),
            () -> new ItemStack(Blocks.COBBLESTONE));

    public static final transFlag FABRIC_ITEM = new transFlag(new FabricItemSettings().group(transcraft.transcraftItemGroup));
    public static final transFlagBlock Trans_Flag_Block = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));


    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("transcraft", "fabric_item"), FABRIC_ITEM);
        Registry.register(Registry.BLOCK, new Identifier("transcraft", "transFlagBlock"), new BlockItem(Trans_Flag_Block, new FabricItemSettings().group(transcraft.transcraftItemGroup)));
    }
}

