package visitor;

/**
 * @author sebastian
 * @date 11/20/20
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        // simple definition of host
        parts = new ComputerPart[]{new Mouse(), new Monitor(), new Keyboard()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        // the host put itself in visitor
        computerPartVisitor.visit(this);
    }
}
