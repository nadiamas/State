package state;

/**
 * Created by nadia on 14/11/2016.
 */
public class State0 implements State {

    int c ;

    public State0(int c) {
        this.c = c;
    }

    public State give(int n) {
        c=c+n;
        if(c>=10){
            return new State1(c);
        }else
            return this ;
    }

    public State askCoffee()  {
        try {
            throw new MachineException();
        } catch (MachineException e) {
            return this;
        }

    }

    public State askTea()  {
        try {
            throw new MachineException();
        } catch (MachineException e) {

            return this;
        }

    }
}
