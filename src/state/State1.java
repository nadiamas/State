package state;

/**
 * Created by nadia on 14/11/2016.
 */
public class State1 implements State {
    int c ;

    public State1(int c) {
        this.c = c;
    }

    public State give(int n) throws MachineException {
        try {
            throw new MachineException();
        } catch (MachineException e) {
            return this;
        }
    }

    public State askCoffee() {
        System.out.println("ok");
        return new State0(0);
    }

    public State askTea() {
        System.out.println("ok");
        return new State0(0);
    }
}
