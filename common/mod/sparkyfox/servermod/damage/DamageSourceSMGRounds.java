package mod.sparkyfox.servermod.damage;

import net.minecraft.util.DamageSource;

public class DamageSourceSMGRounds extends DamageSource {

	public DamageSourceSMGRounds() {
		super("Acid");
		this.setDamageBypassesArmor();
		this.setMagicDamage();
	}

}
