package templatemethod.optimisation;

/**
 * 咖啡因饮料抽象类
 *
 * @author sebastian
 * @date 2020/8/31
 */
public abstract class AbstractCaffeineBeverage {

    /**
     * 声明为final，因为不希望子类覆盖这个方法。
     * 这就是传说中的模板方法！ 为什么呢？
     * 1. 他是个方法
     * 2. 集成了多个方法，是一个算法的模板（这里用来制作咖啡因饮料）
     * summary: 模板算法定义了一个算法的步骤，并允许子类为一个或多个步骤提供实现。
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 咖啡和茶在这一步是不同的，所以要各自实现
     */
    abstract void brew();

    /**
     * 同上
     */
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
