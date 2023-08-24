package com.revature.pena;

import java.util.*;

//import org.apache.commons.lang3.StringUtils;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Person> roster = Arrays.asList(new Person(), new Person(), new Person());
        Person[] rosterAsArray = roster.toArray(new Person[roster.size()]);
        Arrays.sort(rosterAsArray, new PersonAgeComparator());
    }
}
