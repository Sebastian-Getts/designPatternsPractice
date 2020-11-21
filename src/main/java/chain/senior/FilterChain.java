package chain.senior;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sebastian
 * @date 2020/10/18
 */
public class FilterChain implements Filter {
    private final List<Filter> list = new ArrayList<>();

    private int index = 0;

    public FilterChain add(Filter filter) {
        list.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (index == list.size()) {
            return;
        }
        Filter filter = list.get(index);
        index++;
        filter.doFilter(request, response, filterChain);
    }
}
