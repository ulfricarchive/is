package com.ulfric.is;

import com.ulfric.dragoon.application.Container;

public class IsContainer extends Container {

	public IsContainer() {
		install(IsCommand.class);
	}

}