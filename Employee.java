public class Employee {

    String name;
    float salary;
    String id;

    public void printSalary(){
        System.out.println("Employee salary :"+salary);
    }

    public void printEmp(){
        System.out.println("Employee name :"+name);
        System.out.println("Employee id :"+id);
    }

    public static void main(String[] args){
        Employee e = new Employee();
        e.name = "Karthik";
        e.salary = 10000 * 12;
        e.id = "E100";
        e.printEmp();
        e.printSalary();
    }
}
