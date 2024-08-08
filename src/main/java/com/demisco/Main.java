package com.demisco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, "A", "Book", "Car", "A");
        int freq = Collections.frequency(list, "A");
        Collections.sort(list);
        Comparator<String> comp = new Comparator<String>(){
            public int compare(String o1, String o2) {
                return o1.length() < o2.length() ? -1 :
                        (o1.length() == o2.length() ? 0 : +1);
            }
        };
        Collections.sort(list, comp);
        Collections.reverse(list);
        String min = Collections.min(list);
        String max = Collections.max(list);
        String max2 = Collections.max(list, comp);
        Collections.shuffle(list);
        Collections.fill(list, "B");

    }
}