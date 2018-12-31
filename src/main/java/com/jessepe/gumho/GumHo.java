package com.jessepe.gumho;

import com.jessepe.gumho.init.ModItems;
import com.jessepe.gumho.init.ModRecipes;
import com.jessepe.gumho.proxy.CommonProxy;
import com.jessepe.gumho.util.Reference;

import com.jessepe.gumho.util.tabGumHo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class GumHo {

        public static final CreativeTabs GUMHO_TAB = new tabGumHo("tabGH");

        @Mod.Instance
        public static GumHo instance;

        @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
        public static CommonProxy proxy;

        @Mod.EventHandler
        public static void PreInit(FMLPreInitializationEvent event){
                ModItems.registerItems();
        }

        @Mod.EventHandler
        public static void Init(FMLInitializationEvent event){
                ModRecipes.init();
        }

        @Mod.EventHandler
        public static void PostInit(FMLPostInitializationEvent event){

        }

}
