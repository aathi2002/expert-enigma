import java.util.*;

public class wrapperclass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer a = 5;
        Integer b = 6;
        swap(a);

        System.out.println(a);
    }

    public final static int swap(Integer a) {
        ++a;
        return a;

    }

}
