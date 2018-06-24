package com.github.coyclab.factory;

import com.github.coyclab.interfaces.ILineStep;
import com.github.coyclab.interfaces.IProductPart;
import com.github.coyclab.models.Display;

public class DisplayLine implements ILineStep {

	@Override
	public IProductPart buildProductPart() {
		return new Display();
	}
}
