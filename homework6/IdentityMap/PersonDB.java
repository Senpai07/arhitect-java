package ru.geekbrains.pattern.lesson6.IdentityMap;

import static ru.geekbrains.pattern.lesson6.IdentityMap.IdentityMapUtility.addPerson;

public class PersonDB {
    public Person finder(Long key){

        Person person = IdentityMapUtility.getPerson(key);

        if(person == null){
            // TODO Считать из БД
            person = new Person();

            addPerson(person);
        }
        return person;
    }


}
