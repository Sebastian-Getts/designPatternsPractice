package chain.primary;

/**
 * @author sebastian
 * @date 2020/10/18
 */
public class MsgChain {
    private String msg;
    private final Filter[] filters = {new HtmlFilter(), new WordFilter(), new FaceFilter()};

    public String process() {
        for (Filter filter : filters) {
            msg = filter.doFilter(msg);
        }
        return msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
