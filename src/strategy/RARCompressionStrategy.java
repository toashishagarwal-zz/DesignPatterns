package strategy;

import java.io.File;
import java.util.ArrayList;

public class RARCompressionStrategy implements CompressionStrategy {

	@Override
	public void compressFiles(ArrayList<File> files) {
		System.out.println("rar compression");
	}
}
