public class Student {
    String name;
    int age;
    int id;

    public void printStudent(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Id: "+id);
    }

    public static void main(String[] args){
        Student s= new Student();
        s.name = "Praveen";
        s.age = 30;
        s.id = 100;
        s.printStudent();
    }
}
