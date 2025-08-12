import java.time.LocalDate;

import br.com.dio.desafio.domino.Bootcamp;
import br.com.dio.desafio.domino.Curso;
import br.com.dio.desafio.domino.Dev;
import br.com.dio.desafio.domino.Mentoria;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição da mentoria Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila " + devCamila.getConteudoInscritos());

        devCamila.progredir();
        System.out.println("=====");

        System.out.println("Conteúdos inscritos Camila " + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos concluídos Camila " + devCamila.getConteudoConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());


System.out.println("==============");


        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Rafael " + devRafael.getConteudoInscritos());

        devRafael.progredir();
        System.out.println("===");

        System.out.println("Conteúdos inscritos Rafael " + devRafael.getConteudoInscritos());
        System.out.println("Conteúdos concluídos Rafael " + devRafael.getConteudoConcluidos());
        System.out.println("XP: " + devRafael.calcularTotalXp());
    }
}
