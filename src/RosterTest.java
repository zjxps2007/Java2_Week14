import java.util.*;

public class RosterTest {

    interface ChekPesron {
        boolean test(Person p);
    }

    //메소드1: List에서 age보다 많은 나이의 사람을 출력하기
    public static void prinPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    //메소드2: List에서 low보다 많고 high보다 자긍ㄴ 나이의 사람을 출력하기
    public static void printPersonWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }
    public static void printPersons(List<Person> roster, ChekPesron tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
    public static void main(String[] args) {
        List<Person> roster = new ArrayList<>();

        roster.add(new Person("Fred",1980,'M'));
        roster.add(new Person("Jane",1990,'F'));
        roster.add(new Person("George",1991,'M'));
        roster.add(new Person("Bob",2000,'M'));

        for (Person p : roster) {
            p.printPerson();
        }

        System.out.println();

        //메소드 1 사용 : 20살이상의 사람 추력하기
        System.out.println("Persons older than 20:");
        prinPersonsOlderThan(roster, 20);
        System.out.println();

        //메소드2 사용: 14살 이상, 30살이하의 사람 출력하기
        System.out.println("Persons between the ages fo 14 and 30:");
        printPersonWithinAgeRange(roster, 14, 30);
        System.out.println();

        //메소드3 사용: 18살 이상, 25살 이하의 남성 출력하기
        System.out.println("Persons whi are eligble for selective Service:");

        //방법1: 일반적인 방법  ChekPerson을 구현한는 클래스를 구한뒤, test 메소드를 구현하여 사용한다.
        class CheckPersonEligibleForSelectiveService implements ChekPesron {
            public boolean test(Person p) {
                return p.getGender() == 'M' && p.getAge() >= 18 && p.getAge() <=25;
            }
        }
        printPersons(roster, new CheckPersonEligibleForSelectiveService());
        System.out.println();

        //방법2: 무명 크랠스 이용 - 무명클래스로 ChekPerson을 구현하는 클래스를 구현한뒤, test  메솓를 구현하여 사용한다.
        System.out.println("Persons whi are eligible for Selective Service"+"(anonymous class):");
        printPersons(roster, new ChekPesron(){public boolean test(Person p){return  p.getGender() == 'M' && p.getAge() >= 18 &&p.getAge() <=25;}});

        //방법3: 람다식을 이용 - 람다식을 이용하여 바로 메소드에 람다식으로 전달 할 수 있다.
        System.out.println("Persons whi are eligible for Selective Service"+"(anonymous class):");
        printPersons(roster,(Person p) -> p.getGender() == 'M' && p.getAge() >= 18 &&p.getAge() <=25);
    }
}
