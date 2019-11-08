/**
 *
 */
package SimpleTestCase.lib.SimpleExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
/**
 * @author Takemi
 *
 */
public class Book {
	/**
	 * 読み込んだエクセルのハンドル
	 */
	protected Workbook _book;
	
	protected String validate_template_sheet_name = "validate";
	/**
	 * バリデーション処理のテンプレート
	 */
	protected Sheet validate_template;
	
	protected String scenario_template_sheet_name = "scenario";
	/**
	 * テストシナリオのテンプレート
	 */
	protected Sheet scenario_template;

	/**
	 * コンストラクト
	 */
	public Book(){
		_book = null;
	}

	/**
	 * エクセルファイル読込
	 * @param path	ファイルパス
	 */
	public boolean load( String path ){
		try{
			//エクセル
			_book = WorkbookFactory.create( new FileInputStream( path ) );
			
			//バリデーション処理のテンプレートシートを取得
			validate_template = _book.getSheet( validate_template_sheet_name );
			
			//シナリオのテンプレートシートを取得
			scenario_template = _book.getSheet( scenario_template_sheet_name );
			
		} catch( Exception e ){
			e.printStackTrace();
			return false;
		}

		
		return true;
	}

	/**
	 * エクセルの保存
	 * @param path
	 * @return
	 */
	public boolean save( String path ) {
		try {
			FileOutputStream out = new FileOutputStream( path );
			_book.write(out);
		}catch( Exception e ) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
}
