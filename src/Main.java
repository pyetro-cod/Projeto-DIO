import domain.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descrição curso JS");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria JS");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Cloud");
        bootcamp.setDescricao("Decrição do Bootcamp Java Cloud");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devPyetro = new Dev();
        devPyetro.setNome("Pyetro");
        devPyetro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pyetro" + devPyetro.getConteudosInscritos());
        devPyetro.progredir();
        System.out.println("Conteúdos Inscritos Pyetro" + devPyetro.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Pyetro" + devPyetro.getConteudosConluidos());
        System.out.println("XP: " + devPyetro.calcularTotalXp());



        System.out.println(curso1);
    }
}
