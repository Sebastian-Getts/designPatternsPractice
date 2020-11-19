package visitor;

/**
 * @author sebastian
 * @date 11/20/20
 */
public class computerDriver {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerVisitorImpl());
    }
}
