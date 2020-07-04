package iteratorcomposite;

import java.util.ArrayList;

/**
 * @author sebastian
 * @date 7/5/20 1:58 AM
 */
public class PancakeHouseMenuIterator implements Iterator {
    int position = 0;
    ArrayList<MenuItems> menuItems;

    public PancakeHouseMenuIterator(ArrayList<MenuItems> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }

    @Override
    public Object next() {
        MenuItems menuItems = this.menuItems.get(position);
        position = position + 1;
        return menuItems;
    }
}
