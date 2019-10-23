/**
 *
 */
package SimpleTestCase.lib.SimpleExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author a2132305
 *
 */
public class book {
	protected Workbook _book;

	/**
	 * コンストラクト
	 */
	public book(){
		_book = null;
	}

	/**
	 * エクセルファイル読込
	 * @param path	ファイルパス
	 */
	public boolean load( String path ){
		try{
			_book = WorkbookFactory.create(new FileInputStream(path));
		} catch( Exception e ){
			e.printStackTrace();
			return false;
		}

		return true;
	}

}
