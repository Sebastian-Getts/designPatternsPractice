package chain.senior;

/**
 * @author sebastian
 * @date 2020/10/19
 */
public class FilterChainDriver {

    public static void main(String[] args) {
        String msg = "I wanna send sensitive words to the opera {Modern Family} :)";
        // request and response
        Request request = new Request();
        request.setRequestStr(msg);
        Response response = new Response();
        // got filterChain with filters
        FilterChain filterChain = new FilterChain();
        HtmlFilter htmlFilter = new HtmlFilter();
        WordFilter wordFilter = new WordFilter();
        FaceFilter faceFilter = new FaceFilter();
        filterChain.add(htmlFilter).add(wordFilter).add(faceFilter);
        // action
        filterChain.doFilter(request, response, filterChain);
        System.out.println(request.getRequestStr());
    }
}
