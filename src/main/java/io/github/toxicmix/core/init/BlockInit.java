package io.github.toxicmix.core.init;

import io.github.toxicmix.RainbowMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RainbowMod.MOD_ID);

	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.IRON)
					.hardnessAndResistance(15f , 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(-1)
					.sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> RAINBOW_BLOCK = BLOCKS.register("rainbow_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.IRON)
					.hardnessAndResistance(15f , 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(-1)
					.sound(SoundType.METAL)));
	
}