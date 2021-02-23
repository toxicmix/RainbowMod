package io.github.toxicmix.core.init;

import io.github.toxicmix.RainbowMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			RainbowMod.MOD_ID); 
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> RAINBOW_INGOT = ITEMS.register("rainbow_ingot",
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	// block item
	public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register("example_block",
			() -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> RAINBOW_BLOCK = ITEMS.register("rainbow_block",
			() -> new BlockItem(BlockInit.RAINBOW_BLOCK.get(), new Item.Properties().group(ItemGroup.MATERIALS)));
	
}