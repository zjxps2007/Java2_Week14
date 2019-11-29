import java.util.*;

public class LambdaTest3 {
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
        //방법1 : 일반적인 방법 - Comparator를 구현하는 클래스를 사용한다.
        Comparator ci = new CompImp();
        Collections.sort(list, ci);
        // ==Collections.sort(list, new CompImp());

        System.out.println("대소문자를 구별하지 않은 정");
        System.out.println(list);
    }
}
