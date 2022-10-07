package com.Property.Amazon;

import java.io.IOException;



public class ConfigurationHelper_Amazon {
	
	public static ConfigurationReader_Amazon getInstance() throws IOException {

		ConfigurationReader_Amazon cr = new ConfigurationReader_Amazon();
		return cr;
	}

	private ConfigurationHelper_Amazon() {

	}
}
