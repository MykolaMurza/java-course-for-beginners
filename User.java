public abstract class User {
    private String name;
    private String surname;

    protected User() {
    }

    protected User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String mail(String message) {
        return name + ": " + message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
