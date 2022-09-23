public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Leleka", 2, 201);
        System.out.println(student.getSurname());

        Professor professor = new Professor("Oleksandr", "Senko", 10, AcademicStatus.PROFESSOR);
        System.out.println(professor.mail("Hello, my good student!", student.getSurname()));
        System.out.println(professor.mail(100, student.getSurname()));
        System.out.println(professor.getMsgSent());
    }
}
