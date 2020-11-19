package visitor;

/**
 * @author sebastian
 * @date 11/20/20
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Keyboard keyboard);

    void visit(Mouse mouse);

    void visit(Monitor monitor);
}
