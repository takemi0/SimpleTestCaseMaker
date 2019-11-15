package SimpleTestCase.lib.SimpleExcel;

/**
 * 
 * @author Takemi
 */
public class ValidateCol {
	/**
	 * 
	 * @author Takemi
	 */
	public enum ValidateColEnum{
		ValidationName( "バリデーション処理名"),
		ValidationIndex( "バリデーション識別子"),
		ValidateComment("テスト手順"),
		ValidateCommand("Command"),
		ValidateXpath( "Xpath"),
		ValidateValue("Value");
		
		private final String text;
		
		private ValidateColEnum(final String text) {
	        this.text = text;
	    }

	    public String getString() {
	        return this.text;
	    }
	}
	
	/**
	 * カラム番号
	 */
	public int col_num;
	
	/**
	 * カラムの識別子
	 */
	public ValidateColEnum index;
}
