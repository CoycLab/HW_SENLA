package com.github.coyclab.factory;

import com.github.coyclab.interfaces.IAssemblyLine;
import com.github.coyclab.interfaces.IProduct;

public class AssemblyLine implements IAssemblyLine {

    private CaseLine caseLine;
    private MotherBoardLine motherBoardLine;
    private DisplayLine displayLine;

    public AssemblyLine(CaseLine caseLine, MotherBoardLine motherBoardLine, DisplayLine displayLine) {
        System.out.println("Start assembly line...");
        this.caseLine = caseLine;
        this.motherBoardLine = motherBoardLine;
        this.displayLine = displayLine;
    }

    @Override
    public IProduct assembleProduct(IProduct product) {
        product.installFirstPart(caseLine.buildProductPart());
        product.installSecondPart(motherBoardLine.buildProductPart());
        product.installThirdPart(displayLine.buildProductPart());

        return product;
    }
}