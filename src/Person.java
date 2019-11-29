public class Person {
    String name;
    int birthday;
    char gender;

    Person(String name, int birthday, char gender) {
        this.name = name;
        this. birthday = birthday;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return 2019-birthday;
    }
    public int getGender() {
        return gender;
    }
    public void printPerson() {
        System.out.println("name: "+name+" age: "+getAge()+" gender:"+gender);
    }
}
