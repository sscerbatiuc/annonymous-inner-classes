package it.step.annonymous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingLists {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("DDDDDD");
        strings.add("CCCCCCCC");
        strings.add("BBBBBBBBBB");
        strings.add("AAAAAAAAAAAA");

        System.out.println("Sort by content");
        strings.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(strings);

        System.out.println("Sort by length");
        strings.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(strings);

    }
}
