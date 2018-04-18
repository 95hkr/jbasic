package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author kanri
 *
 */
public class FileRead {
	public static void main(String[] args) throws IOException{

		// Fileを取得
		Path path = Paths.get("c:\\training\\Hello.java");
		BufferedReader r = Files.newBufferedReader(path);

		String source;

		while((source = r.readLine()) != null) {
			System.out.println(source);
		}

		// この書き方でもＯＫ
		BufferedReader reader = Files.newBufferedReader(Paths.get("c:\\training\\test.txt"),Charset.forName("SJIS"));

		String contents;

		// ループ処理によってファイルの中身を取得
		while((contents = reader.readLine()) != null) {
			System.out.println(contents);
		}
	}
}
