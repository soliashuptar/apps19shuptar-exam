package json;

//import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by Andrii_Rodionov on 1/4/2017.
 */
public class JsonBoolean extends Json {
    Boolean value;

    public JsonBoolean(Boolean bool) {
        this.value = bool;
//         ToDo
    }

    @Override
    public String toJson() {
        if (value) {
            return "true";

        } else {
            return "false";
        }
        // ToDo
    }
}
