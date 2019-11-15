/**
 * 
 */
package SimpleTestCase.lib.SimpleExcel;

import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * 
 * @author Takemi
 */
public class ValidateScenarioIndex {
	
	public List<VlidateScenarioNode> list = null;
	
	public ValidateScenarioIndex() {
		list = new ArrayList<VlidateScenarioNode>();
	}
	
	public int MakeListSheet( Sheet sheet ) {
		
		list.clear();
		
		//シートのヘッダ情報取得
		
		
		//バリデーションのリストを生成
		
		return list.size();
	}
}
