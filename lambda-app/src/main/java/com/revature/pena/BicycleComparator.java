package com.revature.pena;

import java.util.*;

public class BicycleComparator implements Comparator<Bicycle> {
    @Override
    public int compare(Bicycle a, Bicycle b) {
        return a.getFrameSize().compareTo(b.getFrameSize());
    }
}
