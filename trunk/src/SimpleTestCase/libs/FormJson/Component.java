
package SimpleTestCase.libs.FormJson;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * フォームのINPUT要素
 * @author Takemi
 *
 */
public class Component {

	/**
	 * INPUT要素の名前及びID
	 */
    @SerializedName("name")
    @Expose
    public String name;
    /**
     * INPUT要素の構成クラス
     */
    @SerializedName("type")
    @Expose
    public String type;
    /**
     *  入力チェック
     */
    @SerializedName("validate")
    @Expose
    public List<String> validate = null;
    /**
     * SQL上のデータ型
     */
    @SerializedName("sql")
    @Expose
    public String sql;
    /**
     * 未使用
     */
    @SerializedName("disp_mode")
    @Expose
    public String dispMode;
    /**
     * Option要素　HTMLのclass要素の値
     */
    @SerializedName("class")
    @Expose
    public String _class;
    /**
     * Option要素 HTMLのrequired値
     */
    @SerializedName("required")
    @Expose
    public String required;
    /**
     * Option要素 
     */
    @SerializedName("autocomplete")
    @Expose
    public String autocomplete;
    /**
     * Option要素 
     */
    @SerializedName("min")
    @Expose
    public Integer min;
    /**
     * Option要素 
     */
    @SerializedName("placeholder")
    @Expose
    public String placeholder;
    /**
     * Radio/Select要素の値定義 
     */
    @SerializedName("items")
    @Expose
    public String items;
    /**
     * 未入力時の初期値
     */
    @SerializedName("default")
    @Expose
    public Integer _default;
    /**
     * Option要素 
     */
    @SerializedName("button-calendar")
    @Expose
    public String buttonCalendar;
    /**
     * Option要素 
     */
    @SerializedName("button-calendar-icon")
    @Expose
    public String buttonCalendarIcon;

}
