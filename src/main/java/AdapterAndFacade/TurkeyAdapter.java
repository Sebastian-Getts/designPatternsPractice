package AdapterAndFacade;

/**
 * @author sebastian
 * @date 2020/7/16
 * @description 现在鸭子短缺，想用一些火鸡来冒充。。。
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    /**
     * 要冒充鸭子，当然要有鸭子的功能（实现鸭子接口），不过还是要做自己（（不能忘记自己还是火鸡）
     *
     * @param turkey 火鸡对象的引用
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
