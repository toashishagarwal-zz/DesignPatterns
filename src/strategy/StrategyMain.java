package strategy;

import java.io.File;
import java.util.ArrayList;

public class StrategyMain {

	public static void main(String[] args) {
		CompressionContext ctx = new CompressionContext();
		ctx.setStrategy(new ZipCompressionStrategy());
		ctx.createArchive(new ArrayList<File>());
		
		ctx.setStrategy(new RARCompressionStrategy());
		ctx.createArchive(new ArrayList<File>());
	}
}
