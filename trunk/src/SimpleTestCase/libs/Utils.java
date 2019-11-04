package SimpleTestCase.libs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 便利関数群クラス
 * @author Takemi
 *
 */
public class Utils {
	
	/**
	 * ファイルをテキストファイルとして読込、テキストを取得する。
	 * @param path
	 * @return
	 */
	public static String GetStringFile( String path ) {
		// Java 11以降
		Path file = Paths.get(path);
		String text = "";
		try {
			text = Files.readString(file);
		} catch (IOException e) {
			text = null;
		}
		return text;
	}
}
