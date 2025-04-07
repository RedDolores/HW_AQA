package lesson3;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("AAA", "a", "a", "a", 1, 1);
        employee.printEmployee();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("AAA", "a", "a", "a", 1, 1);
        employees[1] = new Employee("BBB", "b", "b", "b", 2, 2);
        employees[2] = new Employee("CCC", "c", "c", "c", 3, 3);
        employees[3] = new Employee("DDD", "d", "d", "d", 4, 4);
        employees[4] = new Employee("EEE", "e", "e", "e", 5, 5);
        employees[1].printEmployee();

        Park.Attraction attraction = new Park().new Attraction("Gorilla", "9 a.m - 6 p.m", 5);
        System.out.println(attraction);


    }
}
