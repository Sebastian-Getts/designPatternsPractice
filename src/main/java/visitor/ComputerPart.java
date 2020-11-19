package visitor;

/**
 * @author sebastian
 * @date 11/20/20
 */
public interface ComputerPart {
    /**
     * computer part
     *
     * @param computerPartVisitor visitor interface
     */
    void accept(ComputerPartVisitor computerPartVisitor);
}
