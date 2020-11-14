package builder;

/**
 * @author sebastian
 * @date 2020/11/14
 * @description concrete builder
 */
public class ManBuilder implements PersonBuilder {

    Person person;

    public ManBuilder() {
        person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("build my head");
    }

    @Override
    public void buildBody() {
        person.setBody("build my body");
    }

    @Override
    public void buildFoot() {
        person.setFoot("build my foot");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
