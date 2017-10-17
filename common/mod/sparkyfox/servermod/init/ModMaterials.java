package mod.sparkyfox.servermod.init;

import java.util.List;

import com.google.common.collect.Lists;

import mod.sparkyfox.servermod.lib.Material;

public final class ModMaterials {



  public static final List<Material> materials = Lists.newArrayList();


  // mod integration
  public static final Material Titanium       = mat("Titanium", 0xcacaca);

  private static Material mat(String name, int color) {
	    Material mat = new Material(name, color);
	    materials.add(mat);
	    return mat;
	  }
	}

	
