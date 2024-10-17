import java.util.Arrays;

public class MyClass {
    String name;
    String surname;
    int age;
    String[] lessons;
    String favFood;
    public MyClass(String name,String surname,int age ,String[] lessons,String favFood){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.lessons=lessons;
        this.favFood=favFood;
    }
    public MyClass(){
    }

    @Override
    public String toString() {
        return "      MyClass" +
                ", name='" + name +"\n" +
                ", surname='" + surname + "\n" +
                ", age=" + age +"\n"+
                ", lessons=" + Arrays.toString(lessons) +"\n"+
                ", favFood='" + favFood + "\n" ;
    }
}
