package com.github.coyclab;

import com.github.coyclab.factory.AssemblyLine;
import com.github.coyclab.models.Notebook;

public class App {
	public static void main(String[] args) {
		
		AssemblyLine assemblyLine = new AssemblyLine();
		assemblyLine.assembleProduct(new Notebook());
	}
}
