public class Entry {
    public static void main(String[] args) {
        // Tạo đối tượng Person
        Person p = new Person("Minh", 20, "Hanoi");
        System.out.println("=== Person Info ===");
        p.display();

        System.out.println();

        // Tạo đối tượng Student
        Student s = new Student("An", 19, "Danang", 8.5);
        System.out.println("=== Student Info ===");
        s.display();

        System.out.println();

        // Tạo đối tượng Teacher
        Teacher t = new Teacher("Lan", 30, "Hue", 1500);
        System.out.println("=== Teacher Info ===");
        t.display();
    }
}
