package proxy.high;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现InvocationHandler，对目标对象进行增强处理
 *
 * @author sebastian
 * @date 2020/9/12
 */
public class LogHandler implements InvocationHandler {
    /**
     * 被代理的对象，实际方法的执行者
     */
    Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        // 调用target的method方法
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("enhance after invoking");
    }

    private void before() {
        System.out.println("enhance before invoking");
    }
}
