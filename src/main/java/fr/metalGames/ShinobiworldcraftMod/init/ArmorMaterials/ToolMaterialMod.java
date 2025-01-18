package fr.metalGames.ShinobiworldcraftMod.init.ArmorMaterials;

import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ToolMaterialMod {
    public static ItemArmor.ArmorMaterial titane = EnumHelper.addArmorMaterial("titane", 3000, new int[]{10, 10, 10, 10}, 100);
    public static ItemArmor.ArmorMaterial ruby = EnumHelper.addArmorMaterial("ruby", 4000, new int[]{20, 20, 20, 20}, 100);
    public static ItemArmor.ArmorMaterial netherite = EnumHelper.addArmorMaterial("netherite", 3000, new int[]{30, 30, 30, 30}, 100);
    public static ItemArmor.ArmorMaterial enderite = EnumHelper.addArmorMaterial("enderite", 3000, new int[]{40, 40, 40, 40}, 100);

    public ToolMaterialMod() {
    }
}
