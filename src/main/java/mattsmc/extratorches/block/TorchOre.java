package mattsmc.extratorches.block;

import java.util.Random;

import mattsmc.extratorches.common.ExtraTorches;
import mattsmc.extratorches.common.ExtraTorchesItems;
import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;

public class TorchOre extends BlockOre {

	public TorchOre() {
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setHardness(2.0F);
		setResistance(5.0F);
		setLightLevel(.5F);
		setLightOpacity(0);
		setHarvestLevel("pickaxe", 2);
		setBlockTextureName(ExtraTorches.MODID + ":oreTorchOre");
		setBlockName("oreTorchOre");
	}

}
