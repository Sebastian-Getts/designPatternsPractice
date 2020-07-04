package iteratorcomposite;

/**
 * @author sebastian
 * @date 7/5/20 1:52 AM
 */
public class DinerMenuIterator implements Iterator {
    /**
     * position maintains the current position of the iteration over the array
     */
    int position = 0;
    MenuItems[] menuItems;

    public DinerMenuIterator(MenuItems[] menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        // at the end of the array and no more items
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public Object next() {
        MenuItems menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }
}
