package org.example.exercici7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenarDeMesLlargAMesCurt {

    public static List<String> ordenarDeMesLlargAMesCurt(List<String> llista) {

        return llista
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());

    }

}
