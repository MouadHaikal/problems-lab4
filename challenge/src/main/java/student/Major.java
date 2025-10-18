package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public static final Major defaultMajor = new Major("23", "Computer Science");

    public Major(String code, String name) {
        this.code = code;
        this.name = name;
        this.students = new Student[50];
        this.studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if(studentCount>=50){
            System.out.println("Error: Cannot add student to major - Student limit exceeded");
            return;
        }

        students[studentCount++] = s;
    }

    // Getters
    public int getId() { return id; }
    public String getCode() { return code; }
    public String getName() { return name; }
    public int getStudentCount(){ return studentCount; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setCode(String code) { this.code = code; }
    public void setName(String name) { this.name = name; }


    // Display all students in the major
    public void displayStudents() {
        for (int i = 0; i < studentCount; ++i) {
            System.out.println((i+1) + ". " + students[i]);
        }        
    }


    public Student findStudentByCNE(String cne){
        for (int i = 0; i < studentCount; ++i) {
            if (students[i].getCne() == cne) return students[i]; 
        }

        return null;
    }

    public boolean removeStudent(String cne){
        Student s = findStudentByCNE(cne);
        if (s == null) return false;

        for(int i = 0; i < studentCount; ++i){
            if (students[i] == s){
                for(int j = i+1; j < studentCount; ++j){
                    students[j-1] = students[j];
                }

                break;
            }
        }

        students[--studentCount] = null;

        return true;
    }

    public String getOccupancyRate(){
        return String.format("%s capacity: 50 students" + 
                             "\nCurrent enrollment: %d students" + 
                             "\nOccupancy rate = %.2f",
                             this.name, this.studentCount, ((float)this.studentCount / 50) * 100);
    }

    public String getStudentListAsString(){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < studentCount; ++i) {
            builder.append(students[i].toString());
            builder.append("\n");
        }

        return builder.toString();
    }
}
