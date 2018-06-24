package com.github.coyclab.models;

import com.github.coyclab.interfaces.IProduct;
import com.github.coyclab.interfaces.IProductPart;

public class Notebook implements IProduct {
	
	public Notebook() {
		//Case caseBox = new Case();
		//MotherBoard motherBoard = new MotherBoard();
		//Display display = new Display();
		System.out.println("Start making a notebook...");
	}
	
	@Override
	public void installFirstPart(IProductPart product) {
		System.out.println("Installing the compurer case...");
	}

	@Override
	public void installSecondPart(IProductPart product) {
		System.out.println("Installing the motherboard...");
	}

	@Override
	public void installThirdPart(IProductPart product) {
		System.out.println("Installing the display...");
	}
}
