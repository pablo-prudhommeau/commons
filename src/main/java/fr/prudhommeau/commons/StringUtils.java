package fr.prudhommeau.commons;

public class StringUtils {

    public static boolean isNullOrEmpty(String toTest) {
        return toTest == null || toTest.length() == 0;
    }

}
