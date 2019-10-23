package SimpleTestCase.lib.SimpleExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellReference;

public class Utils {

	/**
	 * セルから文字列として値を取得する
	 * @param trg
	 * @return
	 */
	public static String getCellValue( Cell trg ){
		String ret = "";

		if( trg == null ) return ret;

		switch( trg.getCellType() ) {
		case NUMERIC:
			double dd = trg.getNumericCellValue();
			if( dd - (int)dd != 0.0 ){
				ret = Double.toString( dd );
			} else {
				ret = Integer.toString( (int)dd );
			}

			break;

		case STRING:
			ret	= trg.getStringCellValue();
			break;

		default:
			ret = "";
			break;
		}
		return ret;
	}

	/**
	 * A1形式の指定からセルを取得する
	 * http://www.ne.jp/asahi/hishidama/home/tech/apache/poi/cellreference.html
	 * @param sheet
	 * @param position
	 * @return
	 */
	public static Cell getCell(Sheet sheet, String position) {
		CellReference reference = new CellReference(position); // A1形式
		Row row = sheet.getRow(reference.getRow());
		if (row != null) {
			Cell cell = row.getCell(reference.getCol());
			return cell;
		}
		return null;
	}


	/**
	 * セルに値をセットする
	 * @param sheet
	 * @param position
	 * @param value
	 */
	public static void setCell( Sheet sheet, String position, String value ){
		Cell cell = getCell( sheet, position );
		cell.setCellValue( value );
	}
}
