package templatemethod.optimisation;

/**
 * @author sebastian
 * @date 2020/8/31
 */
public abstract class AbstractCaffeineBeverageWithHook {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        // 只有顾客“想要”调料时，才会调用
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 钩子函数(hook)
     * 缺省实现，只会返回true，不做别的事
     * 用户可以选择自己实现，或者用默认的。
     *
     * @return true
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
