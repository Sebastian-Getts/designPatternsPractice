package proxy.high;

import proxy.low.UserService;
import proxy.low.UserServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author sebastian
 * @date 2020/9/13
 */
public class DriverForLog {

    public static void main(String[] args) {
        // userService为被代理的对象
        UserServiceImpl userService = new UserServiceImpl();
        // 获取对应的classLoader
        ClassLoader classLoader = userService.getClass().getClassLoader();
        // 获取所有接口对应的Class，这里的UserServiceImpl只实现了一个接口
        Class<?>[] interfaces = userService.getClass().getInterfaces();

        // LogHandler实现了InvocationHandler接口，代理的是Object，此处传入的是Use
        // rService
        LogHandler logHandler = new LogHandler(userService);
        // 创建代理对象
        UserService invocationHandler = (UserService) Proxy.newProxyInstance(classLoader, interfaces, logHandler);
        invocationHandler.select();
        invocationHandler.update();

        // 保存JDK动态代理生成的代理类，类名保存为 UserServiceProxy
        ProxyUtils.generateClassFile(userService.getClass(), "UserServiceProxyImpl");
    }
}
