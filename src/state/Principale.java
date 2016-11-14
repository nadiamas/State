package state;

/**
 * Created by nadia on 14/11/2016.
 */
public class Principale {

    public static void main(String[] args) throws MachineException {

        Distributeur dis = new Distributeur();

        dis.askCoffee();
        dis.askTea();

        dis.give(5);
        dis.askCoffee();

        dis.give(30);
        dis.askCoffee();

        dis.give(1);
        dis.askCoffee();

    }
}
