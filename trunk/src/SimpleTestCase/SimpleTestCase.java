/**
 * 
 */
package SimpleTestCase;

import SimpleTestCase.TestCase.Project;
import SimpleTestCase.libs.FormJson.Form;
import SimpleTestCase.libs.Utils;
import SimpleTestCase.lib.SimpleExcel.Book;
import SimpleTestCase.lib.SimpleExcel.ValidateScenarioIndex;

import com.google.gson.Gson;

/**
 * @author Takemi
 *
 */
@SuppressWarnings("unused")
public class SimpleTestCase {

	/**
	 * コマンド実行トリガ関数
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println( "SimpleTestCase Begin" );
		
		//設定の生成
		Project project = new Project();
		
		ArgsProc( project, args );

		//フォーム情報読込
		if( project.json_file.length() == 0 ) {
			System.out.println("Jsonファイルのパスを指定してください。");
			return;
		}
		String json = Utils.GetStringFile( project.json_file );
		
		Gson gson = new Gson();
		Form from = null;
		
		try {
			from = gson.fromJson( json, Form.class);
		} catch( Exception e) {
			System.out.println( e.getMessage() );
		}
		
		//テストテンプレート読込
		Book book = new Book();
		book.load( project.test_template_file );
		
		//テストケースの作成	
		{
			//バリデーション処理のテンプレートシナリオのインデックスを作成
			ValidateScenarioIndex index = new ValidateScenarioIndex();	
			index.MakeListSheet( book.GetValidateSheet() );
			
			//バリデーション毎に対応する入力項目をグルーピング
			
			
			//バリデーション毎にシナリオを生成
		}
		
		//テストシナリオの保存
		book.save(  project.make_file );
	}
	
	/**
	 * コマンド引数処理
	 * @param project Project	値を格納するProject変数
	 * @param args	String[] 	引数変数
	 */
	protected static void ArgsProc( Project project, String[] args ) {
		//System.out.println( "" + args.length );
		
		if( args.length == 0 ) return;
		for( int n = 0; n < args.length; n ++ ) {
			switch( args[n] ) {
				case "template":
					project.test_template_file = args[n+1];
					n++;
					break;
					
				case "base_url":
					project.base_url = args[n+1];
					n++;
					break;
					
				case "json":
					project.json_file = args[n+1];
					n++;
					break;
					
				case "output":
					project.make_file = args[n+1];
					break;
					
				case "proejct":
					//プロジェクト設定記入のJSONを読込projectへ反映
					break;
			}
		}
	}

}
