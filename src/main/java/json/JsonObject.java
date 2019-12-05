package json;

import java.util.Arrays;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {
    private JsonPair[] arr;

    public JsonObject(JsonPair... jsonPairs) {
        this.arr = jsonPairs;
//        System.out.println("Im here");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Here" + arr[i].value);
//        }
        // ToDo
    }

    public JsonObject() {
//        this.arr = {};
        // ToDo
    }


    @Override
    public String toJson() {
        // ToDo
        String result = "";
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            result += "'" + arr[i].key + "'" + ":" + " " + arr[i].value.toJson();
            if (i + 1 != arr.length) {
                result += ", ";
            }
//            result += ", ";
//            System.out.println(arr[i].value);
        }
//        return null;
        return "{" + result + "}";
    }

    public void add(JsonPair jsonPair) {
        // ToDo
    }

    public Json find(String name) {
        // ToDo
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        String result = "";
        int j = 0;
        return null;
//        for (int i = 0; i < names.length; i++) {
//            if (names[i].equals(arr[j].key)) {
//                result +=
//            }
//        }
    }
}
