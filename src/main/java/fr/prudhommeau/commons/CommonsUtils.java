package fr.prudhommeau.commons;

import com.github.slugify.Slugify;

import java.io.IOException;

public class CommonsUtils {

    public static String normalize(String input) {
        try {
            return new Slugify().slugify(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
