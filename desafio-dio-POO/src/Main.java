import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Curso Java", "Descricao Java.", 8);
        Curso curso2 = new Curso("Curso JavaScript", "Descricao JavaScript.", 5);

        Conteudo mentoria1 = new Mentoria("Banco PAN", "Descricao mentoria.", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}