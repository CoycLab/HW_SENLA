package com.github.coyclab;

import com.github.coyclab.factory.AssemblyLine;
import com.github.coyclab.factory.CaseLine;
import com.github.coyclab.factory.DisplayLine;
import com.github.coyclab.factory.MotherBoardLine;
import com.github.coyclab.models.Notebook;

public class App {
    public static void main(String[] args) {

        CaseLine caseLine = new CaseLine();
        MotherBoardLine motherBoardLine = new MotherBoardLine();
        DisplayLine displayLine = new DisplayLine();

        AssemblyLine assemblyLine = new AssemblyLine(caseLine, motherBoardLine, displayLine);
        assemblyLine.assembleProduct(new Notebook());
    }
}
