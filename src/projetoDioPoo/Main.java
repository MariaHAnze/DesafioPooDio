package projetoDioPoo;

import projetoDioPoo.dominio.Bootcamp;
import projetoDioPoo.dominio.Curso;
import projetoDioPoo.dominio.Mentoria;
import projetoDioPoo.dominio.Dev;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Code Girls");
        bootcamp.setDescricao("Bootcamp Code Girls 2022");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP Maria: " + devMaria.calcularXp());


        Dev devCristina = new Dev();
        devCristina.setNome("Cristina");
        devCristina.inscreverBootcamp(bootcamp);
        System.out.println("Consteúdos inscritos Cristina: " + devCristina.getConteudosInscritos());
        devCristina.progredir();
        devCristina.progredir();
        devCristina.progredir();
        devCristina.progredir();
        System.out.println("Consteúdos inscritos Cristina: " + devCristina.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Cristina: " + devCristina.getConteudosConcluidos());
        System.out.println("XP Cristina: " +devCristina.calcularXp());

    }
}