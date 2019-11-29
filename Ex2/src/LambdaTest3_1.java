import java.util.*;

public class LambdaTest3_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("AAA");
        list.add("bbb");
        list.add("CCC");
        list.add("ddd");
        list.add("EEE");

        //대소문자를 구별하는 정렬
        Collections.sort(list);

        System.out.println("대소문자를 구별한 정렬: ");
        System.out.println(list);

        //대소문자를 구별하지 않는 정렬
        //방법2 : 무명클래스 - Comparator를 구현하는 무명클래스를 사용한다.
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        System.out.println("대소문자를 구별하지 않은 정렬");
        System.out.println(list);
    }
}
