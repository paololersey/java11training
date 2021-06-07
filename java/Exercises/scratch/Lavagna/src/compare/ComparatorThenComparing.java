package compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorThenComparing {
    // Comparator implements compare(object, object)
    public static void main(String[] args){
        Person p1 = new Person(44, "Tom");
        Person p2 = new Person(40, "Aman");
        Person p3 = new Person(40, "Peter");
        
        List<Person> people = new ArrayList(List.of(p1,p2,p3));
        people.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed());
        people.forEach(p -> System.out.print(p.getName()));

        
    }
}
