

public class ExampleComponent extends Component {
    public ExampleComponent(Mediator mediator) {
        super(mediator);
        this.addActionListener(e -> sendText(this.getText()));
    }

    @Override
    public void receiveText(String text) {
        this.setText(text);
    }
}
