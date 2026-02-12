import domain.Conteudo;
import domain.Curso;
import domain.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);


        System.out.println(curso1);
    }
}
