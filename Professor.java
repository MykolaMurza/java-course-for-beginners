import java.util.List;

public non-sealed class Professor extends Employee {
    private int msgSent;
    private final List<AcademicField> fields;

    public Professor(String name, String surname, int experience,
                     AcademicStatus academicStatus, List<AcademicField> fields) {
        super(name, surname, experience, academicStatus);
        this.msgSent = 0;
        this.fields = fields;
    }

    @Override
    public String mail(String message) {
        msgSent++;
        return super.mail(message);
    }

    public String mail(String message, String studentSurname) {
        msgSent++;
        return super.getName() + " send a message to the student " + studentSurname + ": " + message;
    }

    public String mail(double mark, String studentSurname) {
        msgSent++;
        return super.getName() + " put a mark " + mark + " to the student " + studentSurname;
    }

    public int getMsgSent() {
        return msgSent;
    }

    public List<AcademicField> getFields() {
        return fields;
    }
}
