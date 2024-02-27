import javax.swing.*;

public abstract class Component extends JTextField {
    protected Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendText(String text) {
        mediator.sendText(text, this);
    }

    public abstract void receiveText(String text);
}
