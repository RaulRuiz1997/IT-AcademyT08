package org.example.exercici6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenarDeMesCurtAMesLlarg {

    public static List<String> ordenarDeMesCurtAMesLlarg(List<String> llista) {

        return llista
                .stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

    }

}
