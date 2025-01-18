package fr.metalGames.ShinobiworldcraftMod.init.Items;

import fr.metalGames.ShinobiworldcraftMod.init.ITEMS;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;




    public class netheriteArmor extends ItemArmor {
        public netheriteArmor(ItemArmor.ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
            super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
        }

        public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
            if (stack.getItem() == ITEMS.netherite_leggings) {
                return "shinobiworldcraftmod:textures/models/armor/netherite_layer_2.png";
            } else {
                return stack.getItem() != ITEMS.netherite_helmet && stack.getItem() != ITEMS.netherite_chestplate && stack.getItem() != ITEMS.netherite_boots ? null : "shinobiworldcraftmod:textures/models/armor/netherite_layer_1.png";
            }
        }
    }

