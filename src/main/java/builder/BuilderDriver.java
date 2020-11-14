package builder;

/**
 * @author sebastian
 * @date 2020/11/14
 * @description test driver
 */
public class BuilderDriver {

    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector();
        Person person = personDirector.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
}
