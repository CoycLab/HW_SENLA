package com.github.coyclab.factory;

import com.github.coyclab.interfaces.ILineStep;
import com.github.coyclab.interfaces.IProductPart;
import com.github.coyclab.models.MotherBoard;

public class MotherBoardLine implements ILineStep {

	@Override
	public IProductPart buildProductPart() {
		return new MotherBoard();
	}
}