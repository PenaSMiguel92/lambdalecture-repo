package com.revature.pena;

import java.time.LocalDate;

public class Person {
    LocalDate birthday;

    public int getAge() {
        // ...
        return 0;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }
    
}
