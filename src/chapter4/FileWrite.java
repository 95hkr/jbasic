package chapter4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWrite {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{

		Path path = Paths.get("c:\\training\\write.txt");
		BufferedWriter bw = Files.newBufferedWriter(path);

		bw.write("かきくうきゃく");
		bw.close();

		BufferedWriter writer = Files.newBufferedWriter(Paths.get("c:\\training\\write2.txt"));

		writer.write("あいうえお");
		writer.newLine();
		writer.write("はちくまみつ");
		writer.close();
	}
}
