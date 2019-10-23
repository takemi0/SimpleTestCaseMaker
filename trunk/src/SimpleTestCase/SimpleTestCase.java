/**
 * 
 */
package SimpleTestCase;

import SimpleTestCase.TestCase.Project;

/**
 * @author Takemi
 *
 */
public class SimpleTestCase {

	/**
	 * コマンド実行トリガ関数
	 * @param args
	 */
	public static void main(String[] args) {
		Project project = new Project();
		ArgsProc( project, args );

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
			}
		}
	}

}
