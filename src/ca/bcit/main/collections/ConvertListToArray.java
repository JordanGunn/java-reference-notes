package ca.bcit.main.collections;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertListToArray {

    public static void main(String[] args) {
        String[] stuff  = {"babies", "watermelong", "melons", "fudge"};
        LinkedList<String> theList = new LinkedList<>(Arrays.asList(stuff));
    }
}
