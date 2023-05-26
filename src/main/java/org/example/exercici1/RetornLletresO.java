package org.example.exercici1;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class RetornLletresO {

    public static List<String> retornStringsContinguiLletraO(List<String> llista) {

        return llista
                .stream()
                .filter((element) -> element.contains("o") || element.contains("O"))
                .collect(Collectors.toList());

    }

}
