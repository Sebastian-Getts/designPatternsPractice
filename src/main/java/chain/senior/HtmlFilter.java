package chain.senior;

/**
 * @author sebastian
 * @date 2020/10/19
 */
public class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String replace = request.getRequestStr().replace("<", "[")
                .replace(">", "]");
        request.setRequestStr(replace);
        System.out.println("deal with request string at html filter...");
        // do next filter node and hang on response string
        filterChain.doFilter(request, response, filterChain);
        System.out.println("deal with response string at html filter...");
    }
}
