package proxy.low;

import java.util.Date;

/**
 * 使用静态代理来增强UserService，且不侵入源码。有点像适配器模式。
 * 缺点：
 * 场景复杂时，代理类过于庞大
 * 接口修改时，目标对象与代理类都要同时修改（注意代理类与目标实现了同一个接口）
 * <p>
 * 改进：
 * 让代理动态生成
 *
 * @author sebastian
 * @date 2020/9/12
 */
public class UserServiceProxyImpl implements UserService {
    private final UserService target;

    public UserServiceProxyImpl(UserService target) {
        this.target = target;
    }

    @Override
    public void select() {
        before();
        target.select();
        after();
    }

    @Override
    public void update() {
        before();
        target.update();
        after();
    }

    private void after() {
        System.out.printf("log after time [%s]%n", new Date());
    }

    private void before() {
        System.out.printf("log start time  [%s]%n", new Date());
    }
}
