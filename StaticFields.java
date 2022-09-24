import java.util.List;

public class StaticFields {
    public static final AcademicField MATH =
            new AcademicField("Math", 80, List.of("arithmetic", "equations"));
    public static final AcademicField JAVA =
            new AcademicField("Java with OOP", 120, List.of("variables", "oop"));
}
