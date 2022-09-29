import java.util.Objects;

public final class Student extends User implements Cloneable {
    private int yearOfStudy;
    private int groupNumber;

    public Student() {
    }

    public Student(String name, String surname, int yearOfStudy, int groupNumber) {
        super(name, surname);
        this.yearOfStudy = yearOfStudy;
        this.groupNumber = groupNumber;
    }

    @Override
    public String mail(String message) {
        return "Student " + super.mail(message);
    }

    @Override
    public String getSurname() {
        return super.getSurname().charAt(0) + ".";
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
            return new Student();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + super.getName() +
                ", surname=" + super.getSurname() +
                ", yearOfStudy=" + groupNumber +
                ", groupNumber=" + groupNumber +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return super.getName().equals(student.getName())
                && super.getSurname().equals(student.getName())
                && yearOfStudy == student.yearOfStudy
                && groupNumber == student.groupNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName(), super.getSurname(), yearOfStudy, groupNumber);
    }
}
