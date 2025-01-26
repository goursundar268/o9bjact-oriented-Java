/*
 * Write a Java program that uses records to manage employee data.
 * Define an Employee record with id, name and department.
 * Implement methods to find an employee by id and to update the department of an employee.
 * Use a Map to store and manage these Employee records.
 */
import java.util.HashMap;
import java.util.Map;
public class Assignment_13 // Class: EmployeeManagement
{
    record Employee(int id, String name, String department) {}
    private static Map<Integer, Employee> employees = new HashMap<>(); // Map to store Employee records
    public static void addEmployee(Employee employee)
    {
        employees.put(employee.id(), employee);
    }
    public static Employee findEmployeeById(int id)
    {
        return employees.get(id);
    }
    public static void updateDepartment(int id, String newDepartment)
    {
        Employee employee = employees.get(id);
        if(employee != null)
        {
            employees.put(id,new Employee(employee.id(), employee.name(), newDepartment));
        }
    }
    public static void main(String[] args) {
        addEmployee(new Employee(1, "Alice", "HR"));
        addEmployee(new Employee(2, "Bob", "IT"));
        addEmployee(new Employee(3, "Charlie", "Finance"));

        Employee employee = findEmployeeById(2);
        System.out.println("Employee found: " + employee);

        updateDepartment(3, "Sales");
        System.out.println("Updated Employee: " + employees.get(3));
    }
}
