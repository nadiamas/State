package state;

/**
 * Created by nadia on 14/11/2016.
 */
public interface State {
    State give(int n) throws MachineException;
    State askCoffee() throws MachineException;
    State askTea() throws MachineException;
}
