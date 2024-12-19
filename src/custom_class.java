

class Employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("my first custom class");
        Employee harry = new Employee();
        Employee X = new Employee();
        X.id=10;
        X.name="Rahul";
        harry.id=12;
        harry.name="Harry";
        X.printdetails();
        harry.printdetails();

    }
}