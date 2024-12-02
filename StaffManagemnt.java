
import java.util.Scanner;

public class StaffManagemnt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers of emplyees: ");
        int num0ofEmloyees = input.nextInt();

        EmployeeClass[] employees = new EmployeeClass[num0ofEmloyees];
        for (int i = 0; i < num0ofEmloyees; i++) {
            System.out.println("Enter data of no" + (i + 1) + ":");
            System.out.println("Enter ID : ");
            int id = input.nextInt();
            input.nextLine();
            System.out.println("Enter name :");
            String name = input.nextLine();

            System.out.println("Enter depart : ");
            String department = input.nextLine();

            System.out.println("Enter the salary:");
            double salary = input.nextInt();

            System.out.println("Enter the bouns:");
            double bouns = input.nextInt();

            System.out.println("Is he a citizen? (true/false)");
            boolean isResident = input.nextBoolean();

            employees[i] = new EmployeeClass(id, name, department, salary, bouns, isResident);
        }
        System.out.println("All employees data : ");
        for (EmployeeClass employee : employees) {
            employee.print_emp_data();
            System.out.println("---------------------------------------------");

        }
    }

}
