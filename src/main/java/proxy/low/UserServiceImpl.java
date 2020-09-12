package proxy.low;

/**
 * @author sebastian
 * @date 2020/9/12
 */
public class UserServiceImpl implements UserService {

    @Override
    public void select() {
        System.out.println("select by id");
    }

    @Override
    public void update() {
        System.out.println("update by id");
    }
}
