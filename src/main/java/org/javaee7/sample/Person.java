package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author arungupta

 projet test dta aaaa

 sdddddddddddddddddddddddddddd
 */
@XmlRootElement
public class Person {
    private String name;
    rivate String lastName;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}