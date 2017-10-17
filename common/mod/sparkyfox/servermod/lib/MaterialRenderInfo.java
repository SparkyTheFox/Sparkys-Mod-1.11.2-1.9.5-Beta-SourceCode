package mod.sparkyfox.servermod.lib;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Determines the type of texture used for rendering a specific material
 */
@SideOnly(Side.CLIENT)
public interface MaterialRenderInfo {

  TextureAtlasSprite getTexture(TextureAtlasSprite baseTexture, String location);

  boolean isStitched();

  boolean useVertexColoring();

  int getVertexColor();

  // this actually would require its own thing, but we put it here for simplicity
  String getTextureSuffix();

  MaterialRenderInfo setTextureSuffix(String suffix);

  abstract class AbstractMaterialRenderInfo implements MaterialRenderInfo {

    private String suffix;

    @Override
    public boolean isStitched() {
      return true;
    }

    @Override
    public boolean useVertexColoring() {
      return false;
    }

    @Override
    public int getVertexColor() {
      return 0xffffffff; // white and opaque
    }

    @Override
    public String getTextureSuffix() {
      return suffix;
    }

    @Override
    public MaterialRenderInfo setTextureSuffix(String suffix) {
      this.suffix = suffix;
      return this;
    }
  }

  /**
   * Does not actually generate a new texture. Used for vertex-coloring in the model generation
   * Safes VRAM, so we use vertex colors instead of creating new data.
   */
  class Default extends AbstractMaterialRenderInfo {

    public final int color;

    public Default(int color) {
      this.color = color;
    }

    @Override
    public TextureAtlasSprite getTexture(TextureAtlasSprite baseTexture, String location) {
      return baseTexture;
    }

    @Override
    public boolean isStitched() {
      return false;
    }

    @Override
    public boolean useVertexColoring() {
      return true;
    }

    @Override
    public int getVertexColor() {
      return color;
    }
  }

}




