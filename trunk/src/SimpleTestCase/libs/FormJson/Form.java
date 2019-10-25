package SimpleTestCase.libs.FormJson;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * フォームJSONクラス
 * @author Takemi
 *
 */
public class Form {

	/**
	 * ヘッダー情報
	 */
    @SerializedName("head")
    @Expose
    public Head head;
    
    /**
     * INPUT要素郡(配列)
     */
    @SerializedName("Component")
    @Expose
    public List<Component> component = null;

}
