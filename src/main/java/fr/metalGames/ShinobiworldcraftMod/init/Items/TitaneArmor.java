package fr.metalGames.ShinobiworldcraftMod.init.Items;


import fr.metalGames.ShinobiworldcraftMod.init.ITEMS;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class TitaneArmor extends ItemArmor {
    public TitaneArmor(ItemArmor.ArmorMaterial material, int id, int metaData) {
        super(material, id, metaData);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == ITEMS.titane_leggings) {
            return "shinobiworldcraftmod:textures/models/armor/titane_layer_2.png";
        } else {
            return stack.getItem() != ITEMS.titane_helmet && stack.getItem() != ITEMS.titane_chestplate && stack.getItem() != ITEMS.titane_boots ? null : "shinobiworldcraftmod:textures/models/armor/titane_layer_1.png";
        }
    }
}
