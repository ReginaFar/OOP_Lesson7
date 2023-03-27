import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    String department;
    double salary;

    public Employee(String name, String surname, String department, double salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Employee employee = (Employee) o;

        if (name != null ? !name.equals(employee.name) : employee.name != null)
            return false;
        return surname != null ? surname.equals(employee.surname) : employee.surname == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.surname);
    }
}