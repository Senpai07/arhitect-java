package ru.geekbrains.pattern.lesson6.IdentityMap;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapUtility {

    private static Map personMap = new HashMap();

    public static void addPerson(Person arg) {
        personMap.put(arg.getId(), arg);
    }

    public static Person getPerson(Long key) {
        return (Person) personMap.get(key);
    }

    public static Person getPerson(long key) {
        return getPerson(key);
    }
}
