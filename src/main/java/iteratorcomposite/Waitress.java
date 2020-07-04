package iteratorcomposite;

/**
 * @author sebastian
 * @date 7/5/20 1:57 AM
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n--------\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    /**
     * 对于传入的迭代对象，做遍历
     *
     * @param iterator iterator object
     */
    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItems menuItems = (MenuItems) iterator.next();
            System.out.print(menuItems.getName() + ", ");
            System.out.print(menuItems.getPrice() + " --");
            System.out.println(menuItems.getDescription());
        }
    }
}
