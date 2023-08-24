package com.revature.pena;

import java.util.*;
import java.util.function.Supplier;

//import org.apache.commons.lang3.StringUtils;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<Person> roster = Arrays.asList(new Person(), new Person(), new Person());
        Person[] rosterAsArray = roster.toArray(new Person[roster.size()]);
        Arrays.sort(rosterAsArray, Person::compareByAge);

        Set<Person> rosterSetLambda = transferElements(roster, () -> {
            return new HashSet<>();
        });
    }

    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements( SOURCE sourceCollection, Supplier<DEST> collectionFactory) {
        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
    }
}

