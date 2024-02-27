import java.util.ArrayList;
import java.util.List;

public class ExampleMediator implements Mediator {
    private List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void sendText(String text, Component component) {
        components.stream()
                .filter(c -> c != component)
                .forEach(c -> c.receiveText(text));
    }
}
