import java.util.*;

public class LambdaTest3_2 {
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
        //방법3 : 람다식 - 람다식을 이용하여 메소드를 전달한다.
        Collections.sort(list, (o1, o2) ->o1.compareToIgnoreCase(o2));

        System.out.println("대소문자를 구별하지 않은 정렬");
        System.out.println(list);
    }
}
