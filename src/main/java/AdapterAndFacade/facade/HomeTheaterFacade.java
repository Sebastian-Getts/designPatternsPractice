package AdapterAndFacade.facade;

/**
 * @author sebastian
 * @date 2020/7/16
 * @description facade，注意他跟装饰模式、适配器模式的区别。对于调用他的人来说，把细节隐藏，只暴露出实现目标。
 * Decorator---Converts one interface to another; Adapter---adds responsibility; Facade---Makes an interface simpler
 */
public class HomeTheaterFacade {
    PopcornPopper popcornPopper;
    Screen screen;

    public HomeTheaterFacade(PopcornPopper popcornPopper, Screen screen) {
        this.popcornPopper = popcornPopper;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popcornPopper.on();
        screen.on();
        // ...省略了其他步骤（如放碟片）
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        screen.off();
    }
}
