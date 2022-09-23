public sealed class Employee extends User permits Professor, Director {
    private int experience;
    private AcademicStatus academicStatus;

    public Employee(String name, String surname, int experience, AcademicStatus academicStatus) {
        super(name, surname);
        this.experience = experience;
        this.academicStatus = academicStatus;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public AcademicStatus getAcademicStatus() {
        return academicStatus;
    }

    public void setAcademicStatus(AcademicStatus academicStatus) {
        this.academicStatus = academicStatus;
    }
}
