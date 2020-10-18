package chain.primary;

/**
 * @author sebastian
 * @date 2020/10/18
 */
public class MsgChainDriver {

    public static void main(String[] args) {
        String msg = "I wanna send some sensitive words and see <the big bang theory> :)";
        MsgChain msgChain = new MsgChain();
        msgChain.setMsg(msg);
        System.out.println(msgChain.process());
    }
}
