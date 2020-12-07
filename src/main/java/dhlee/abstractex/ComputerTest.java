package dhlee.abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        // Computer computer  = new Computer(); 'Computer' is abstract; cannot be instantiated
        Computer computer = new Desktop();
        computer.display();
        computer.turnOff();

        Computer myNotebook = new MyNotebook();
        myNotebook.display();
        myNotebook.turnOff();
    }
}
