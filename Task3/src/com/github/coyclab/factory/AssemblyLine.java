package com.github.coyclab.factory;

import com.github.coyclab.interfaces.IAssemblyLine;
import com.github.coyclab.interfaces.IProduct;

public class AssemblyLine implements IAssemblyLine {

	CaseLine caseLine;
	MotherBoardLine motherBoardLine;
	DisplayLine displayLine;
	
	public AssemblyLine() {
		System.out.println("Start assembly line...");
		caseLine = new CaseLine();
		motherBoardLine = new MotherBoardLine();
		displayLine = new DisplayLine();
	}
	
	@Override
	public IProduct assembleProduct(IProduct product) {
		product.installFirstPart(caseLine.buildProductPart());
		product.installSecondPart(motherBoardLine.buildProductPart());
		product.installThirdPart(displayLine.buildProductPart());
				
		return product;
	}
}