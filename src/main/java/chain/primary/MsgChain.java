package chain.primary;

import lombok.Data;

/**
 * @author sebastian
 * @date 2020/10/18
 */
@Data
public class MsgChain {
    private String msg;
    private Filter[] filters = {new HtmlFilter(), new WordFilter(), new FaceFilter()};

    public String process() {
        for (Filter filter : filters) {
            msg = filter.doFilter(msg);
        }
        return msg;
    }
}
