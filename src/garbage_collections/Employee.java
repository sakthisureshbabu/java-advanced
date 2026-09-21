package garbage_collections;

// Without explicit garbage collection
public class Employee {
    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;
    // it is made static because it is keep common among all and shared by all objects

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }

    public void show() {
        System.out.println("Id=" + ID + "\nName=" + name + "\nAge=" + age);
    }

    public void showNextId() {
        System.out.println("Next employee id will be=" + nextId);
    }

    public static void main(String[] args) {
        Employee E = new Employee("Daenyrs Targaryen", 27);
        Employee F = new Employee("Viserys Targaryen", 33);
        Employee G = new Employee("Rhaegar Targaryen", 50);
        E.show();
        F.show();
        G.show();
        E.showNextId();
        F.showNextId();
        G.showNextId();

        {
            // It is sub block to keep all those interns.
            Employee X = new Employee("Jon Snow", 26);
            Employee Y = new Employee("Aegon Targayen", 28);
            X.show();
            Y.show();
            X.showNextId();
            Y.showNextId();
        }

        // Output of this line
        E.showNextId();
    }
}
