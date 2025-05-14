package net.tomeoprod.tomeoprodssorcery;

import net.fabricmc.api.ModInitializer;

import net.tomeoprod.tomeoprodssorcery.init.TomeoprodSorceryProcedures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TomeoprodsSorcery implements ModInitializer {
	public static final String MOD_ID = "tomeoprodssorcery";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TomeoprodSorceryProcedures.load();
		ModItems.registerModItems();
	}
}