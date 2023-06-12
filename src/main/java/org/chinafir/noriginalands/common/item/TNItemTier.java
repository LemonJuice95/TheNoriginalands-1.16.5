package org.chinafir.noriginalands.common.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum TNItemTier implements IItemTier {

    INDIGO_STEEL(4, 1680, 9.0F, 4.0F, 20, () -> Ingredient.of(new ItemStack(TNItemRegister.INDIGO_STEEL_INGOT.get())));

    private int level;
    private int uses;
    private float speed;
    private float damage;
    private int enchantmentValue;
    private LazyValue<Ingredient> repairIngredient;

    private TNItemTier(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
