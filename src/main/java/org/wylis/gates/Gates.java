package org.wylis.gates;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import org.wylis.gates.blocks.DoubleDoors;

@Mod(modid = Gates.MODID, name = Gates.NAME, version = Gates.VERSION)
public class Gates
{
    public static final Block doubleDoors = new DoubleDoors(Material.wood).setHardness(3.0F).setStepSound(Block.soundTypeWood).setCreativeTab(CreativeTabs.tabBlock).setBlockName("doorDoubleDoors").setBlockTextureName("door_wood");

    public static final String MODID = "gates";
    public static final String NAME = "Wylis Gates";
    public static final String VERSION = "0.0.1";

    @Mod.Instance("Gates")
    public static Gates instance;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.registerBlock(doubleDoors, "DoubleDoors");
    }
}
