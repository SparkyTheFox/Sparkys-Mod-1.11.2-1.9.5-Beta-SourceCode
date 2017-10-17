package mod.sparkyfox.servermod.lib;

import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class Material {

  public static final Material UNKNOWN = new Material("unknown", TextFormatting.WHITE);
  public static final String LOC_Name = "material.%s.name";
  public static final String LOC_Prefix = "material.%s.prefix";
  

  public MaterialRenderInfo renderInfo;// = new MaterialRenderInfo.Default(0xffffff);
  public int materialTextColor = 0xffffff; // used in tooltips and other text. Saved in NBT.
  
  public Material(String identifier, TextFormatting textColor) {
	    this(identifier, Util.enumChatFormattingToColor(textColor));
	  }

	  public Material(String identifier, int color) {
	    this.identifier = Util.sanitizeLocalizationString(identifier); // lowercases and removes whitespaces

	    // if invisible, make it fully opaque.
	    if(((color >> 24) & 0xFF) == 0) {
	      color |= 0xFF << 24;
	    }

	    this.materialTextColor = color;
	    if(FMLCommonHandler.instance().getSide().isClient()) {
	      //setRenderInfo(color);
	    }
	  }
  
  /**
   * This String uniquely identifies a material.
   */
  public final String identifier;

 
 public String getIdentifier() {
    return identifier;
  }
}