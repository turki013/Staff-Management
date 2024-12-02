
public class EmployeeClass {

    int emp_id;
    String ename, depart;
    double salary, bouns;
    boolean resident;

    public EmployeeClass() {
        emp_id = 165;
        ename = "No name available..";
        salary = 3500;
        bouns = 160;
        depart = "Not Assigned yet..";
        resident = true;
    }

    public EmployeeClass(int id, String n) {
        emp_id = id;
        ename = n;
    }

    public EmployeeClass(int id, String n, boolean r) {
        this(id, n);
        resident = r;
    }

    public EmployeeClass(int emp_id, String ename, String depart, double salary, double bouns, boolean resident) {
        this.emp_id = emp_id;
        this.ename = ename;
        this.depart = depart;
        this.salary = salary;
        this.bouns = bouns;
        this.resident = resident;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public void setSalary(double s, double b) {
        this.setSalary(s);
        bouns = b;

    }

    public void print_emp_data() {
        System.out.println("ID:" + emp_id);
        System.out.println("Name:" + ename);
        System.out.println("Depart:" + depart);
        System.out.println("Salary :" + salary);
        System.out.println("Bouns:" + bouns);
        System.out.println("Resident:" + resident);
    }

}
