package lesson12;

import java.util.Formatter;

public class Report extends Employee {
    public static void main(String[] args) {
        Employee[] emp = new Employee[2];
        emp[0] = new Employee("Иван Петрович", 150.444444);
        emp[1] = new Employee("Хел бой", 244.1555555);
        generateReport(emp);
        System.out.println();
    }


    public static void generateReport(Employee[] emp) {
        Formatter f = new Formatter();
        System.out.println("%.2f" + f);
    }
}
