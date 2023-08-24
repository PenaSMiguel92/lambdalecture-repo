package com.revature.pena;

import java.util.*;

import org.apache.commons.lang3.StringUtils;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> messages = Arrays.asList("hello", "revature", "associates!");
        messages.forEach(word -> StringUtils.capitalize(word));
        messages.forEach(StringUtils::capitalize);

        BicycleComparator bikeFrameSizeComparator = new BicycleComparator();
        List<Bicycle> bicycleList = Arrays.asList(new Bicycle("Giant"), new Bicycle("Scott"), new Bicycle("Trek"),
                new Bicycle("GT"));

        bicycleList.stream().sorted(bikeFrameSizeComparator::compare);
        System.out.println(bicycleList);

        List<String> bikeBrands = Arrays.asList("Giant", "Scott", "Trek", "GT");
        Bicycle[] bikes = bikeBrands.stream().map(Bicycle::new).toArray(Bicycle[]::new);
        for (Bicycle bike : bikes) {
            System.out.println(bike);
        }
    }
}
