package org.wylis.gates;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid = Gates.MODID, name = Gates.NAME, version = Gates.VERSION)
public class Gates
{
	public static final String MODID = "gates";
    public static final String NAME = "Wylis Gates";
    public static final String VERSION = "0.0.1";

    @Mod.Instance("Gates")
    public static Gates instance;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
