package com.imoonday.more_templates;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.EmptyEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class MoreTemplates implements ModInitializer {

    public static final String MOD_ID = "more_templates";
    public static final Item IRON_UPGRADE_SMITHING_TEMPLATE = Items.register(new Identifier(MOD_ID, "iron_upgrade_smithing_template"), SmithingTemplates.createIronUpgrade());
    public static final Item DIAMOND_UPGRADE_SMITHING_TEMPLATE = Items.register(new Identifier(MOD_ID, "diamond_upgrade_smithing_template"), SmithingTemplates.createDiamondUpgrade());

    @Override
    public void onInitialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.addBefore(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, DIAMOND_UPGRADE_SMITHING_TEMPLATE);
            entries.addBefore(DIAMOND_UPGRADE_SMITHING_TEMPLATE, IRON_UPGRADE_SMITHING_TEMPLATE);
        });
        LootPool diamondPool = LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0f))
                .with(EmptyEntry.builder().weight(4))
                .with(ItemEntry.builder(DIAMOND_UPGRADE_SMITHING_TEMPLATE).weight(1))
                .build();
        LootPool ironPool = LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0f))
                .with(EmptyEntry.builder().weight(4))
                .with(ItemEntry.builder(IRON_UPGRADE_SMITHING_TEMPLATE).weight(1))
                .build();
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (LootTables.VILLAGE_TOOLSMITH_CHEST.equals(id) || LootTables.VILLAGE_ARMORER_CHEST.equals(id) || LootTables.VILLAGE_WEAPONSMITH_CHEST.equals(id)) {
                tableBuilder.pool(diamondPool).pool(ironPool);
            }
        });
    }
}
