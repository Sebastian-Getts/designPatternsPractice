package builder;

/**
 * @author sebastian
 * @date 2020/11/14
 * @description Director
 */
public class PersonDirector {

    /**
     * separate builder from there appearance
     *
     * @param personBuilder builder
     * @return person/product
     */
    public Person constructPerson(PersonBuilder personBuilder) {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildFoot();
        return personBuilder.buildPerson();
    }
}
