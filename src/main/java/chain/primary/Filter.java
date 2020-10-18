package chain.primary;

/**
 * @author sebastian
 * @date 2020/10/18
 */
public interface Filter {

    /**
     * 模拟简单的责任链，B端输入，S端做校验
     *
     * @param s input string
     * @return the filtered string
     */
    String doFilter(String s);
}
