+import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        this.stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee{name='" + name + "'}";
    }
}

public class lab12q2 {
    public static void main(String[] args) {
       
        GenericStack<Student> studentStack = new GenericStack<>();
        studentStack.push(new Student("John"));
        studentStack.push(new Student("Jane"));

        System.out.println("Student Stack:");
        while (!studentStack.isEmpty()) {
            System.out.println(studentStack.pop());
        }

        
        GenericStack<Employee> employeeStack = new GenericStack<>();
        employeeStack.push(new Employee("Alice"));
        employeeStack.push(new Employee("Bob"));

        System.out.println("\nEmployee Stack:");
        while (!employeeStack.isEmpty()) {
            System.out.println(employeeStack.pop());
        }
    }
}
