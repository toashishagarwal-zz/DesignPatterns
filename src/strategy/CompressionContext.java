package strategy;

import java.io.File;
import java.util.ArrayList;

public class CompressionContext {
	private CompressionStrategy strategy;
	
	public void setStrategy(CompressionStrategy str) {
		strategy = str;
	}
	
	public void createArchive(ArrayList<File> files) {
		strategy.compressFiles(files);
	}
}
