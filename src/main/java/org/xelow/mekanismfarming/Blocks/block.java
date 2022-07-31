package org.xelow.mekanismfarming.Blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.xelow.mekanismfarming.Blocks.custom.MFCropsBlock;
import org.xelow.mekanismfarming.Items.item;
import org.xelow.mekanismfarming.MekanismFarming;

public class block
{
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, MekanismFarming.id);

    //Register blocks
    public static final RegistryObject<Block> CoalCrops = BLOCK.register("coal_crops",
            () -> new MFCropsBlock());


    public static void register(IEventBus iEventBus)
    {
        BLOCK.register(iEventBus);
    }
}
