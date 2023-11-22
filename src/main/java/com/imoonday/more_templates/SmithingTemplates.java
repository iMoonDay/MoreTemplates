package com.imoonday.more_templates;

import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

public class SmithingTemplates {

    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    private static final Text IRON_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier("iron_upgrade"))).formatted(TITLE_FORMATTING);
    private static final Text IRON_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.iron_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text IRON_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.iron_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text IRON_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.iron_upgrade.base_slot_description")));
    private static final Text IRON_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.iron_upgrade.additions_slot_description")));
    private static final Text DIAMOND_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier("diamond_upgrade"))).formatted(TITLE_FORMATTING);
    private static final Text DIAMOND_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.diamond_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text DIAMOND_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.diamond_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text DIAMOND_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.diamond_upgrade.base_slot_description")));
    private static final Text DIAMOND_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.diamond_upgrade.additions_slot_description")));
    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = new Identifier("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = new Identifier("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = new Identifier("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = new Identifier("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE = new Identifier("item/empty_slot_hoe");
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE = new Identifier("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE = new Identifier("item/empty_slot_sword");
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = new Identifier("item/empty_slot_shovel");
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = new Identifier("item/empty_slot_pickaxe");
    private static final Identifier EMPTY_SLOT_INGOT_TEXTURE = new Identifier("item/empty_slot_ingot");

    public static SmithingTemplateItem createIronUpgrade() {
        return new SmithingTemplateItem(IRON_UPGRADE_APPLIES_TO_TEXT, IRON_UPGRADE_INGREDIENTS_TEXT, IRON_UPGRADE_TEXT, IRON_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, IRON_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getIronUpgradeEmptyBaseSlotTextures(), getIronUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getIronUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    private static List<Identifier> getIronUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public static SmithingTemplateItem createDiamondUpgrade() {
        return new SmithingTemplateItem(DIAMOND_UPGRADE_APPLIES_TO_TEXT, DIAMOND_UPGRADE_INGREDIENTS_TEXT, DIAMOND_UPGRADE_TEXT, DIAMOND_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, DIAMOND_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getDiamondUpgradeEmptyBaseSlotTextures(), getDiamondUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getDiamondUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    private static List<Identifier> getDiamondUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }
}
