package io.github.toxicmix.core.init;

import com.google.common.base.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ModItemTier implements IItemTier {

    RAINBOW(5, 800, 7.0F, 3.0F, 12, () -> {
        return Ingredient.fromItems(ItemInit.RAINBOW_INGOT.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel; // what it can mine
        this.maxUses = maxUses; // durability
        this.efficiency = efficiency; // speed
        this.attackDamage = attackDamage; // damage
        this.enchantability = enchantability; // how good enchants are per level
        this.repairMaterial = repairMaterial; // what to repair it with
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}