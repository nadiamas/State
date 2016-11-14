package state;

/**
 * Created by nadia on 14/11/2016.
 */
public class Distributeur {
    private State state;

    public Distributeur() {
        state= new State0(0);
    }

    void give(int n) throws MachineException {
        state = state.give(n);
    }

    void askCoffee() throws MachineException {
        state=state.askCoffee();
    }
    void askTea() throws MachineException {
        state= state.askTea();
    }
}
