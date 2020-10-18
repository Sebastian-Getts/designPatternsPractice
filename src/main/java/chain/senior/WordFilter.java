package chain.senior;

/**
 * @author sebastian
 * @date 2020/10/19
 */
public class WordFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String word = request.getRequestStr().replace("sensitive", "normal");
        request.setRequestStr(word);
        System.out.println("deal with request string at word filter...");
        filterChain.doFilter(request, response, filterChain);
        System.out.println("deal with response string at word filter...");
    }
}
