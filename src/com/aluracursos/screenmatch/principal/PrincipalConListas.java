package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El Señor de los Anillos", 2001);
        peliculaDeBruno.evalua(10);
        Serie casaDragon = new Serie("La Casa del Dragón", 2022);

        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtitas = new ArrayList<>();
        listaDeArtitas.add("Penelope Cruz");
        listaDeArtitas.add("Antonio Banderas");
        listaDeArtitas.add("Ricardo Darín");
        listaDeArtitas.add("Carlos Vives");
        listaDeArtitas.add("Marcos Brunet");
        System.out.println(listaDeArtitas);

        Collections.sort(listaDeArtitas);
        System.out.println("Lista ordenada de artistas: " + listaDeArtitas);

        Collections.sort(lista);
        System.out.println("Lista ordenada de Titulos ordenadas" + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: "+ lista);

    }
}
