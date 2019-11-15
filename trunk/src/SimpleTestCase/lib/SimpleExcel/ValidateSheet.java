/**
 * 
 */
package SimpleTestCase.lib.SimpleExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;

/**
 *  
 * @author Takemi
 */
public class ValidateSheet {
	protected Sheet _sheet;
	
	public ValidateSheet( Sheet sheet ) {
		_sheet = sheet;
	}
	
	/**
	 * ヘッダー情報を整理
	 */
	public ValidateHeader MakeHeader() {
		ValidateHeader ret = new ValidateHeader( );
		
		Cell cell = null;
		int line = 0;
		boolean flag = false;

		//ヘッダ行検索
		for( line = 0; line < _sheet.getLastRowNum(); line ++ ){
			try{
				cell = _sheet.getRow(line).getCell(0);
			} catch( Exception e){
				continue;
			}

			if( cell.getStringCellValue().equals("#") ) {
				flag = true;
				break;
			}
		}
		if( flag == false ) return null;
		
		ret.header_row = line;
		
		//列の取得
		for(  int col = 1; col < _sheet.getRow( ret.header_row ).getLastCellNum(); col ++ ) {
			String col_val = _sheet.getRow(  ret.header_row ).getCell( col ).getStringCellValue();
			
			ValidateCol tmp = new ValidateCol();
			tmp.col_num = col;
			if( col_val == ValidateCol.ValidateColEnum.ValidationName.toString() ) {
				//バリデーション名の場合
				tmp.index = ValidateCol.ValidateColEnum.ValidationName;
			}
			
			if( col_val == ValidateCol.ValidateColEnum.ValidationIndex.toString() ) {
				tmp.index = ValidateCol.ValidateColEnum.ValidationName;
			}
			
			if( col_val == ValidateCol.ValidateColEnum.ValidateComment.toString() ) {
				tmp.index = ValidateCol.ValidateColEnum.ValidateComment;
			}
			
			if( col_val == ValidateCol.ValidateColEnum.ValidateCommand.toString() ) {
				tmp.index = ValidateCol.ValidateColEnum.ValidateCommand;
			}
			
			if( col_val == ValidateCol.ValidateColEnum.ValidateXpath.toString() ) {
				tmp.index = ValidateCol.ValidateColEnum.ValidateXpath;
			}
			
			if( col_val == ValidateCol.ValidateColEnum.ValidateValue.toString() ) {
				tmp.index = ValidateCol.ValidateColEnum.ValidateValue;
			}
			
			ret.cols.add( tmp );
		}
		
		return ret;
	}
}
