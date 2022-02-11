import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void getList(List<String> list) {
        list.add("12");
        list.add("13");
        list.add("14");
    }

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        getList(list);
        System.out.println(list.size());

    }
}
