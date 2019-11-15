package SimpleTestCase.lib.SimpleExcel;

import java.util.ArrayList;
import java.util.Vector;

/**
 * バリデーションシートのヘッダ情報
 * @author Takemi
 *
 */
public class ValidateHeader {
	/**
	 * ヘッダーの行数
	 */
	public int header_row;
	public ArrayList<ValidateCol>	cols;
	
	public ValidateHeader() {
		cols = new ArrayList<ValidateCol>();
		header_row = 0;
	}
}
