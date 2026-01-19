package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    // TODO: Add fields and static variables.
    private static int counter = 1;
    private int id;
    private Subject subject;

    public ConcreteObserver(Subject subject) {
        // TODO: Implement constructor.
        this.subject = subject;
        this.id = counter++;
        this.subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        // TODO: Implement update method.
        if (subject instanceof ConcreteSubject) {
            int value = ((ConcreteSubject) subject).getValue();
            System.out.println("Observer " + id + " received update from subject: New value is " + value);
        }
    }

    public void detach() {
        // TODO: Implement detach method.
        this.subject.detach(this);
    }
}
