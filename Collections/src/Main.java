import java.util.*;
public class Main {
    public static void main(String[] args)   {
        List<Person> list = new ArrayList<>();


        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");
        Person person3 = new Person("Rabbi2");

        list.add(person1);
        list.add(person2);
        list.add(person3);

        Iterator<Person> iterator = list.iterator();

        for (Person person: list){
            list.remove(person);
        }

        foo(list);


    }
    private static void foo(List<Person> persons){

    }

}





        //this command "get" allows to get value that you give arraylist
        /*Person person1FromCollection = list.get(0);
        Person person2FromCollection = list.get(0);*/