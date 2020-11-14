package builder;

/**
 * @author sebastian
 * @date 2020/11/14
 * @description Builder Patterns
 */
public interface PersonBuilder {

    /**
     * build head
     */
    void buildHead();

    /**
     * build body
     */
    void buildBody();

    /**
     * build foot
     */
    void buildFoot();

    /**
     * build person
     *
     * @return person
     */
    Person buildPerson();
}
