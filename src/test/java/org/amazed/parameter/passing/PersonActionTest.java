package org.amazed.parameter.passing;

import org.junit.jupiter.api.Test;

public class PersonActionTest {

    @Test
    public void test1() {
        Person person = new Person("John", "Doe");
        assert person.getName().equals("John");
        assert person.getLastName().equals("Doe");
        assert person.isEnable();

        PersonAction action = new PersonAction();
        Person newPerson = action.changeLastName(person, "Smith");
        assert newPerson.getName().equals("John");
        assert newPerson.getLastName().equals("Smith");
        assert !newPerson.isEnable();
        assert person.getName().equals("John");
        assert person.getLastName().equals("Smith");
        assert !person.isEnable();
    }

    @Test
    public void test2() {
        Person person = new Person("John", "Doe");
        assert person.getName().equals("John");
        assert person.getLastName().equals("Doe");
        assert person.isEnable();

        PersonAction action = new PersonAction();
        Person newPerson = action.changeLastNameClone(person, "Smith");
        assert newPerson.getName().equals("John");
        assert newPerson.getLastName().equals("Smith");
        assert newPerson.isEnable();
        assert person.getName().equals("John");
        assert person.getLastName().equals("Doe");
        assert !person.isEnable();
    }

}
