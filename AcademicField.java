import java.util.ArrayList;
import java.util.List;

public record AcademicField(String name, int hours, List<String> topics) {
    @Override
    public List<String> topics() {
        return new ArrayList<>(topics);
    }
}
