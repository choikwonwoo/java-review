package day5;

public class Person {
    String name;
    String sex;
    int size = 0;
    public  Person(String name,String sex,int size){
        this.name = name;
        this.sex = sex;
        this.size = size;
    }
    // 생성자 오버로딩
    public Person(String name, String sex){
        this(name,sex,30);
    }
}
