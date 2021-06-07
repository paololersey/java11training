
import java.util.*;
import java.util.function.DoublePredicate;
 
// MEDIUM
class Employee {
    private String name;
    private double salary;
 
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
 
    public String getName() {
        return name;
    }
 
    public double getSalary() {
        return salary;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    public String toString() {
        return "{" + name + ", " + salary + "}";
    }
}
 
public class PredicateNegate {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Jack", 8000),
                new Employee("Lucy", 12000));
        updateSalary(employees, d -> d < 10000);
        employees.forEach(System.out::println);
    }
 
    private static void updateSalary(List<Employee> list, DoublePredicate predicate) {
        for(Employee e : list) {
            if(predicate.negate().test(e.getSalary())) {
                e.setSalary(e.getSalary() + 2000);
            }
        }
    }
}
