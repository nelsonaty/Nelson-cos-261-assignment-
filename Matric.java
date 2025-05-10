public class Student {
    String name;
    String matricNo;
    int score;

    public Student(String name, String matricNo, int score) {
        this.name = name;
        this.matricNo = matricNo;
        this.score = score;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Matric No: " + matricNo);
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", "MAT123", 85);
        student.displayInfo();
    }
}
