/**
 * 
 */
package SimpleTestCase;

import SimpleTestCase.TestCase.Project;
import SimpleTestCase.libs.FormJson.Form;
import SimpleTestCase.libs.Utils;
import SimpleTestCase.lib.SimpleExcel.Book;
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
		
		Project project = new Project();
		ArgsProc( project, args );

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
		
		Book book = new Book();
		book.load( project.test_template_file );
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
			}
		}
	}

}
