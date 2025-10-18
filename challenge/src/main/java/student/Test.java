package student;

public class Test {
    public static void main(String[] args) {
        Major physics = new Major("12", "Physics");
        Major math = new Major("14", "Math");

        Student p1 = new Student("Mada", "Adam", "0612093165", "adamada@gmail.com", "1212", physics);
        Student p2 = new Student("Sana", "Anas", "0622563368", "anassana@gmail.com", "6472", physics);

        Student m1 = new Student("Abih", "Hiba", "0756593210", "hibaabih@gmail.com", "0424", math);

        Student s1 = new Student("Imad", "Dami", "0612984320", "imaddami@gmail.com", "9021");

        // Display computer science students
        System.out.println("Computer Science:");
        Major.defaultMajor.displayStudents();
        System.out.println("getFullNameFormatted: ");
        System.out.println(p1.getFullNameFormatted());
        System.out.println(Major.defaultMajor.findStudentByCNE("1212"));
        System.out.println(Major.defaultMajor.removeStudent("1212"));
        System.out.println(Major.defaultMajor.getOccupancyRate());
    }
}
