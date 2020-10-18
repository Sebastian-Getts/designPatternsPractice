package chain.primary;

/**
 * @author sebastian
 * @date 2020/10/18
 */
public class HtmlFilter implements Filter {
    @Override
    public String doFilter(String s) {
        return s.replace("<", "[")
                .replace(">", "]");
    }
}
