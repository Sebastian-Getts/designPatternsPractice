package AdapterAndFacade.facade;

/**
 * @author sebastian
 * @date 2020/7/16
 * @description HomeTheaterTestDrive
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        PopcornPopper popcornPopper = new PopcornPopper();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(popcornPopper, screen);
        homeTheaterFacade.watchMovie("Iron Man");
        homeTheaterFacade.endMovie();
    }
}
