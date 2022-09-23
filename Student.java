public final class Student extends User {
    private int yearOfStudy;
    private int groupNumber;

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
}
