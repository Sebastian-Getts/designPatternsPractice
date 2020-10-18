package chain.senior;

/**
 * @author sebastian
 * @date 2020/10/19
 */
public class FaceFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String word = request.getRequestStr().replace(":)", "^_^");
        request.setRequestStr(word);
        System.out.println("deal with request string at face filter...");
        filterChain.doFilter(request, response, filterChain);
        System.out.println("deal with response string at face filter...");
    }
}
