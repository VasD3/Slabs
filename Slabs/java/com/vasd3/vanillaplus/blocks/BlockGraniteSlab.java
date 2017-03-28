package com.vasd3.vanillaplus.blocks;

import java.util.Random;

import com.vasd3.vanillaplus.Reference;
import com.vasd3.vanillaplus.VanillaPlus;
import com.vasd3.vanillaplus.init.ModBlocks;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class BlockGraniteSlab extends BlockSlab
{
    public static final PropertyEnum<BlockGraniteSlab.Variant> VARIANT = PropertyEnum.<BlockGraniteSlab.Variant>create("variant", BlockGraniteSlab.Variant.class);

    public BlockGraniteSlab(String unlocalizedName)
    {
        super(Material.ROCK);
        this.setUnlocalizedName(unlocalizedName);
 		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
 		this.setHardness(1.5F);
 		this.setResistance(30F);
 		this.useNeighborBrightness = true;
 		
        IBlockState iblockstate = this.blockState.getBaseState();

        if (!this.isDouble())
        {
            iblockstate = iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
        }

        this.setDefaultState(iblockstate.withProperty(VARIANT, BlockGraniteSlab.Variant.DEFAULT));
        this.setCreativeTab(VanillaPlus.tabVanillaPlus);
    }

    @Override
 	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
 		return Item.getItemFromBlock(ModBlocks.graniteSlabHalf);
 	}

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(ModBlocks.graniteSlabHalf);
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, BlockGraniteSlab.Variant.DEFAULT);

        if (!this.isDouble())
        {
            iblockstate = iblockstate.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
        }

        return iblockstate;
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;

        if (!this.isDouble() && state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP)
        {
            i |= 8;
        }

        return i;
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return this.isDouble() ? new BlockStateContainer(this, new IProperty[] {VARIANT}): new BlockStateContainer(this, new IProperty[] {HALF, VARIANT});
    }

    @Override
    public String getUnlocalizedName(int meta)
    {
        return this.getUnlocalizedName();
    }

    @Override
    public IProperty<?> getVariantProperty()
    {
        return VARIANT;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack)
    {
        return BlockGraniteSlab.Variant.DEFAULT;
    }
    
    @Override
 	public int damageDropped(IBlockState state) {
 		return 0;
 	}

    public static enum Variant implements IStringSerializable
    {
        DEFAULT;

        public String getName()
        {
            return "default";
        }
    }
}
