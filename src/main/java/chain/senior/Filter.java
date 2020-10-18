package chain.senior;

/**
 * @author sebastian
 * @date 2020/10/18
 */
public interface Filter {
    /**
     * 做一个类似tomcat中的过滤器一样，不仅输入过滤，在服务器返回时仍会有过滤操作
     * i.e. B->S: 1-2-3, S->B: 3-2-1
     *
     * @param request     模拟request请求
     * @param response    模拟response请求
     * @param filterChain 过滤器链的引用
     */
    void doFilter(Request request, Response response, FilterChain filterChain);
}
