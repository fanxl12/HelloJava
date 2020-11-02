import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int next = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 5) {
                next = i + 1;
                break;
            }
        }
        if (next < list.size()) {
            System.out.printf("结果:" + list.get(next));
        }
    }
}
