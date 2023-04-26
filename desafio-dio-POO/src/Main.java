import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Curso Java", "Descricao Java.", 8);
        Curso curso2 = new Curso("Curso JavaScript", "Descricao JavaScript.", 5);

        Conteudo mentoria1 = new Mentoria("Banco PAN", "Descricao mentoria.", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("descricao Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Gabriel: " + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("Conteudos inscritos Gabriel: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteudos inscritos Gabriel: " + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Lucas: " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("Conteudos inscritos Lucas: " + devLucas.getConteudosInscritos());
        System.out.println("Conteudos inscritos Lucas: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/
    }
}