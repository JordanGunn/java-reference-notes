package ca.bcit.main.stringMethods;

public class StringMethods {

    public static void main(String[] args) {

        String[] words = {"funk", "chunk", "furry", "baconator"};

        // startsWith
        for (String w: words) {
            if (w.startsWith("fu")) {
                System.out.println(w + " starts with fu");
            }
        }

        // endsWith
        for (String w: words) {
            if (w.endsWith("nk")) {
                System.out.println(w + " ends with nk");
            }
        }

        // indexOf
        String s = "buckyrobersbuckyroberts";
        System.out.println(s.indexOf('k'));
        System.out.println(s.indexOf('k', 5)); // ignore the first 5 chars
        System.out.println(s.indexOf("rob")); // get the starting point of "rob"
        System.out.println(s.indexOf("rob", 10)); // get the starting point of "rob" and ignore first 10 chas

        // concatenation
        String a = "Bacon ";
        String b = "monster";
        System.out.println(a + b);          // concatenate string method 1
        System.out.println(a.concat(b));    // method 2


        // replace
        System.out.println(a.replace('B', 'F'));


        System.out.println(a.trim());
    }
}
