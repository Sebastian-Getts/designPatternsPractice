package proxy.low;

/**
 * @author sebastian
 * @date 2020/9/12
 */
public class LowDriverTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxyImpl proxy = new UserServiceProxyImpl(userService);

        userService.select();
        userService.update();
        System.out.println("=======when invoking proxy");
        proxy.select();
        proxy.update();

    }
}
