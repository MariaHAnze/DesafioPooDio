package projetoDioPoo;

import projetoDioPoo.dominio.Curso;
import projetoDioPoo.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(40);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Curso de Python");
        curso2.setCargaHoraria(10);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java");
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Python");
        mentoria2.setDescricao("Metoria de Python");
        mentoria2.setData(LocalDate.now());

    }
}