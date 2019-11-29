import java.util.*;

public class CompImp implements Comparator<String> {
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}
