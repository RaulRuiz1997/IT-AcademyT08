package org.example;

import org.example.exercici1.RetornLletresO;
import org.example.exercici2.RetornLletresOMes5Lletres;
import org.example.exercici5.InterfazFuncional;
import org.example.exercici6.OrdenarDeMesCurtAMesLlarg;
import org.example.exercici7.OrdenarDeMesLlargAMesCurt;
import org.example.exercici8.InterfazFuncional2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> lletres = List.of("Oriol", "Carlos", "Pepe", "Mauricio", "Calamar", "Olga");
        List<String> mesos = List.of("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre");

        System.out.println("\n---Llista original---\n" + lletres);

        // Exercici 1 --------------------------------------------------------------------------------------------------

        System.out.println("\nExercici 1:");
        System.out.println(RetornLletresO.retornStringsContinguiLletraO(lletres));

        // Exercici 2 --------------------------------------------------------------------------------------------------

        System.out.println("\nExercici 2:");
        System.out.println(RetornLletresOMes5Lletres.retornStringsContinguiLletraO(lletres));

        // Exercici 3 --------------------------------------------------------------------------------------------------

        System.out.println("\nExercici 3:");
        mesos.forEach(mes -> System.out.println(mes));

        // Exercici 4 --------------------------------------------------------------------------------------------------

        System.out.println("\nExercici 4:");
        mesos.forEach(System.out::println);

        // Exercici 5 --------------------------------------------------------------------------------------------------

        System.out.println("\nExercici 5:");
        InterfazFuncional interfazFuncional = () -> 3.1415;

        System.out.println(interfazFuncional.getPiValue());

        // Exercici 6 --------------------------------------------------------------------------------------------------

        System.out.println("\nExercici 6:");
        System.out.println(OrdenarDeMesCurtAMesLlarg.ordenarDeMesCurtAMesLlarg(lletres));

        // Exercici 7 --------------------------------------------------------------------------------------------------

        System.out.println("\nExercici 7:");
        System.out.println(OrdenarDeMesLlargAMesCurt.ordenarDeMesLlargAMesCurt(lletres));

        // Exercici 8 --------------------------------------------------------------------------------------------------

        System.out.println("\nExercici 8:");
        InterfazFuncional2 interfazFuncional2 = (cadena) -> {

            StringBuilder sb = new StringBuilder();

            sb.append(cadena);

            sb.reverse();

            return sb.toString();

        };

        System.out.println(interfazFuncional2.reverse("cadena"));

    }

}