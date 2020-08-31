package templatemethod;

/**
 * 泡茶
 *
 * @author sebastian
 * @date 2020/8/31
 */
public class Tea {

    /**
     * 实现了泡茶的步骤
     */
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    /**
     * 出现了与“煮咖啡”相同的代码
     */
    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }

    /**
     * 需要清理一下设计模式了！
     */
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
