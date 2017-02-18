package Designite;

import java.io.IOException;
import Designite.SourceModel.*;

public class Application {
	public static void main(String[] args) throws IOException{

		//args[0]: filePath
		if (args.length != 1) {
			usage();
			throw new IllegalArgumentException();
		}
		InputArgs argsObj = new InputArgs(args[0]);
		SourceModel sourceModel = new SourceModel(argsObj);
		sourceModel.create();
	}

	private static void usage() {
		System.err.println("First argument needs to be the path to a batch input file.");
		System.out.println("Usage instructions:");
		System.out.println("java Designite <Path to a batch input file>");
	}
}
