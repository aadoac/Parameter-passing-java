package org.amazed.parameter.passing;

public class Person implements Cloneable{
    private String name;
    private String lastName;
    private boolean enable;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.enable = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
