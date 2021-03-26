package io.github.toxicmix.core.init;

import io.github.toxicmix.RainbowMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			RainbowMod.MOD_ID); 
	
	// items
	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().group(RainbowMod.RAINBOW_TAB)));
	
	public static final RegistryObject<Item> RAINBOW_INGOT = ITEMS.register("rainbow_ingot",
			() -> new Item(new Item.Properties().group(RainbowMod.RAINBOW_TAB)));
	
	public static final RegistryObject<Item> RAINBOW_NUGGET = ITEMS.register("rainbow_nugget",
			() -> new Item(new Item.Properties().group(RainbowMod.RAINBOW_TAB)));
	
	// block items
	public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register("example_block",
			() -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(), new Item.Properties().group(RainbowMod.RAINBOW_TAB)));
	
	public static final RegistryObject<BlockItem> RAINBOW_BLOCK = ITEMS.register("rainbow_block",
			() -> new BlockItem(BlockInit.RAINBOW_BLOCK.get(), new Item.Properties().group(RainbowMod.RAINBOW_TAB)));
	
	public static final RegistryObject<BlockItem> RAINBOW_ORE = ITEMS.register("rainbow_ore",
			() -> new BlockItem(BlockInit.RAINBOW_ORE.get(), new Item.Properties().group(RainbowMod.RAINBOW_TAB)));
	
	// tools
	public static final RegistryObject<SwordItem> RAINBOW_SWORD = ITEMS.register("rainbow_sword",
            () -> new SwordItem(ModItemTier.RAINBOW, 2, -2.4F, new Item.Properties().group(RainbowMod.RAINBOW_TAB)));
	
	public static final RegistryObject<PickaxeItem> RAINBOW_PICKAXE = ITEMS.register("rainbow_pickaxe",
	            () -> new PickaxeItem(ModItemTier.RAINBOW, 1, -2.6F, new Item.Properties().group(RainbowMod.RAINBOW_TAB)));

	public static final RegistryObject<ShovelItem> RAINBOW_SHOVEL = ITEMS.register("rainbow_shovel",
	            () -> new ShovelItem(ModItemTier.RAINBOW, 0.5F, -3.0F, new Item.Properties().group(RainbowMod.RAINBOW_TAB)));

	public static final RegistryObject<AxeItem> RAINBOW_AXE = ITEMS.register("rainbow_axe",
	            () -> new AxeItem(ModItemTier.RAINBOW, 5, -3.1F, new Item.Properties().group(RainbowMod.RAINBOW_TAB)));
	
	
	// Armor
    public static final RegistryObject<ArmorItem> RAINBOW_HELMET = ITEMS.register("rainbow_helmet",
            () -> new ArmorItem(ModArmorMaterial.RAINBOW, EquipmentSlotType.HEAD, new Item.Properties().group(RainbowMod.RAINBOW_TAB)));

    public static final RegistryObject<ArmorItem> RAINBOW_CHESTPLATE = ITEMS.register("rainbow_chestplate",
            () -> new ArmorItem(ModArmorMaterial.RAINBOW, EquipmentSlotType.CHEST, new Item.Properties().group(RainbowMod.RAINBOW_TAB)));

    public static final RegistryObject<ArmorItem> RAINBOW_LEGGINGS = ITEMS.register("rainbow_leggings",
            () -> new ArmorItem(ModArmorMaterial.RAINBOW, EquipmentSlotType.LEGS, new Item.Properties().group(RainbowMod.RAINBOW_TAB)));

    public static final RegistryObject<ArmorItem> RAINBOW_BOOTS = ITEMS.register("rainbow_boots",
            () -> new ArmorItem(ModArmorMaterial.RAINBOW, EquipmentSlotType.FEET, new Item.Properties().group(RainbowMod.RAINBOW_TAB)));
            
}