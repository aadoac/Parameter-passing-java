
package org.amazed.parameter.passing;

public class PersonAction {

    public Person changeLastName(Person person, String newLastName) {
        Person newPerson = person;
        newPerson.setLastName(newLastName);
        newPerson.setEnable(true);
        person.setEnable(false);
        return newPerson;
    }

    public Person changeLastNameClone(Person person, String newLastName) {
        Person newPerson = null;
        try {
            newPerson = (Person) person.clone();
            newPerson.setLastName(newLastName);
            newPerson.setEnable(true);
            person.setEnable(false);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning error: " + e.getMessage() );
        }
        return newPerson;
    }
}
