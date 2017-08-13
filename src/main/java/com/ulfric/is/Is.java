package com.ulfric.is;

import com.ulfric.plugin.Plugin;

public class Is extends Plugin {

	public Is() {
		install(IsCommand.class);
	}

}