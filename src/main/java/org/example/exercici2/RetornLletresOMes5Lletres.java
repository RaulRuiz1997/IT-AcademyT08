package org.example.exercici2;

import java.util.List;
import java.util.stream.Collectors;

public class RetornLletresOMes5Lletres {

    public static List<String> retornStringsContinguiLletraO(List<String> llista) {

        return llista
                .stream()
                .filter(element -> element.length() > 5)
                .filter(element -> element.contains("o") || element.contains("O"))
                .collect(Collectors.toList());

    }

}
