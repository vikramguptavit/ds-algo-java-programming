
public class Employee {
    String name;
    long id;
    int yearsOfExp;

    public Employee(String name, long id, int yearsOfExp) {
        this.name = name;
        this.id = id;
        this.yearsOfExp = yearsOfExp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", yearsOfExp=" + yearsOfExp +
                '}';
    }

    public static void main(String[] args) {

        Employee employee= new Employee("Vikram Gupta",201303L,3);
        System.out.println(employee);

    }

}
