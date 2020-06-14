package factory;

/**
 * @author sebastian
 * @date 6/14/20 8:53 PM
 */
public class MarinaraSauce extends Sauce {
    String sauce;

    public MarinaraSauce() {
        sauce = "marinara sauce...";
    }

    @Override
    String createSauce() {
        return "marinara sauce...";
    }
}
