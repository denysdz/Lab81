import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ExampleMediator mediator = new ExampleMediator();
        ExampleComponent component1 = new ExampleComponent(mediator);
        ExampleComponent component2 = new ExampleComponent(mediator);
        ExampleComponent component3 = new ExampleComponent(mediator);
        ExampleComponent component4 = new ExampleComponent(mediator);

        mediator.addComponent(component1);
        mediator.addComponent(component2);
        mediator.addComponent(component3);
        mediator.addComponent(component4);

        JFrame frame = new JFrame();
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(component1);
        frame.add(component2);
        frame.add(component3);
        frame.add(component4);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}