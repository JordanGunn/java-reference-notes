package ca.bcit.main.comparator;

import java.util.Comparator;

// to implement comparator, simply include implements keyword
// and create a new class
// comparator is primarily used for sorting LISTS
public class SortComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
