class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. John", "Mathematics");
        teacher.display();
    }
}
