package SimpleTestCase.libs.FormJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * フォームJSONのヘッダー要素
 * @author Takemi
 *
 */
public class Head {

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("version")
    @Expose
    public String version;

}
