package heranca.projetoPessoas.test;

import heranca.projetoPessoas.*;
import utilidades.CoresTerminal;

import java.util.ArrayList;
import java.util.Objects; // Utilizar para comparar valor. Não usar o ==, pois em Java, o operador == compara referências de objetos (se eles apontam para o mesmo local na memória). Para tipos primitivos, ele compara valores.
import java.util.Scanner;

public class VisualizarService {
    public static void visualizarDadosProfessor(Scanner scanner, ArrayList<Professor> listaProfessor){
        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|        Visualizar Professor       |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        System.out.println(CoresTerminal.AZUL + "Qual professor deseja visualizar? (Digite o nome)");
        String nomeDoProfessor = scanner.nextLine();

        Professor professorEncontrado = null; // não tem nenhum valor.

        // Localizar o cadastro do professor informado:
        for (Professor prof : listaProfessor){
            if (Objects.equals(prof.getNome(), nomeDoProfessor)) {
                professorEncontrado = prof;
                break;
            }
        }
        // Com o professor encontrado, ele inicializa o menu de amostra.

        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|         Resultado da Busca        |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        if (professorEncontrado == null){
            System.out.println(CoresTerminal.VERMELHO + "Professor com o nome '" + nomeDoProfessor + "' não foi encontrado.");
        } else {
            System.out.println(CoresTerminal.AMARELO + "Nome: " + CoresTerminal.RESET + CoresTerminal.VERDE + professorEncontrado.getNome());
            System.out.println(CoresTerminal.AMARELO + "Idade: " + CoresTerminal.RESET + CoresTerminal.VERDE + professorEncontrado.getIdade());
            System.out.println(CoresTerminal.AMARELO + "Sexo: " + CoresTerminal.RESET + CoresTerminal.VERDE + professorEncontrado.getSexo());
            System.out.println(CoresTerminal.AMARELO + "Especialidade: " + CoresTerminal.RESET + CoresTerminal.VERDE + professorEncontrado.getEspecialidade());
            System.out.println(CoresTerminal.AMARELO + "Salário: " + CoresTerminal.RESET + CoresTerminal.VERDE + professorEncontrado.getSalario());
        }
        System.out.println(CoresTerminal.AZUL + "|===================================|");

    }
    public static void visualizarDadosAluno(Scanner scanner, ArrayList<Aluno> listaAluno){
        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|          Visualizar Aluno         |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        System.out.println(CoresTerminal.AZUL + "Qual Aluno deseja visualizar? (Digite o nome)");
        String nomeDoAluno = scanner.nextLine();

        Aluno alunoEncontrado = null;

        for (Aluno aluno : listaAluno){
            if (Objects.equals(aluno.getNome(), nomeDoAluno)) {
                alunoEncontrado = aluno;
                break;
            }
        }

        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|         Resultado da Busca        |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        if (alunoEncontrado == null){
            System.out.println(CoresTerminal.VERMELHO + "Aluno com o nome '" + nomeDoAluno + "' não foi encontrado.");
        } else {
            System.out.println(CoresTerminal.AMARELO + "Nome: " + CoresTerminal.RESET + CoresTerminal.VERDE + alunoEncontrado.getNome());
            System.out.println(CoresTerminal.AMARELO + "Idade: " + CoresTerminal.RESET + CoresTerminal.VERDE + alunoEncontrado.getIdade());
            System.out.println(CoresTerminal.AMARELO + "Sexo: " + CoresTerminal.RESET + CoresTerminal.VERDE + alunoEncontrado.getSexo());
            System.out.println(CoresTerminal.AMARELO + "Curso: " + CoresTerminal.RESET + CoresTerminal.VERDE + alunoEncontrado.getCurso());
            System.out.println(CoresTerminal.AMARELO + "Matricula: " + CoresTerminal.RESET + CoresTerminal.VERDE + alunoEncontrado.isMatricula());
        }
        System.out.println(CoresTerminal.AZUL + "|===================================|");
    }
    public static void visualizarDadosBolsista(Scanner scanner, ArrayList<Bolsista> listaBolsista){
        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|        Visualizar Bolsista        |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        System.out.println(CoresTerminal.AZUL + "Qual Aluno Bolsista deseja visualizar? (Digite o nome)");
        String nomeDoBolsista = scanner.nextLine();

        Bolsista bolsistaEncontrado = null;

        for (Bolsista bolsista : listaBolsista){
            if (Objects.equals(bolsista.getNome(), nomeDoBolsista)) {
                bolsistaEncontrado = bolsista;
                break;
            }
        }

        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|         Resultado da Busca        |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        if (bolsistaEncontrado == null){
            System.out.println(CoresTerminal.VERMELHO + "Aluno bolsista com o nome '" + nomeDoBolsista + "' não foi encontrado.");
        } else {
            System.out.println(CoresTerminal.AMARELO + "Nome: " + CoresTerminal.RESET + CoresTerminal.VERDE + bolsistaEncontrado.getNome());
            System.out.println(CoresTerminal.AMARELO + "Idade: " + CoresTerminal.RESET + CoresTerminal.VERDE + bolsistaEncontrado.getIdade());
            System.out.println(CoresTerminal.AMARELO + "Sexo: " + CoresTerminal.RESET + CoresTerminal.VERDE + bolsistaEncontrado.getSexo());
            System.out.println(CoresTerminal.AMARELO + "Curso: " + CoresTerminal.RESET + CoresTerminal.VERDE + bolsistaEncontrado.getCurso());
            System.out.println(CoresTerminal.AMARELO + "Matricula: " + CoresTerminal.RESET + CoresTerminal.VERDE + bolsistaEncontrado.isMatricula());
            System.out.println(CoresTerminal.AMARELO + "Bolsa: " + CoresTerminal.RESET + CoresTerminal.VERDE + bolsistaEncontrado.getBolsa());
        }
        System.out.println(CoresTerminal.AZUL + "|===================================|");
    }
    public static void visualizarDadosTecnico(Scanner scanner, ArrayList<Tecnico> listaTecnico){
        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|         Visualizar Técnico        |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        System.out.println(CoresTerminal.AZUL + "Qual Aluno Técnico deseja visualizar? (Digite o nome)");
        String nomeDoTecnico = scanner.nextLine();

        Tecnico tecnicoEncontrado = null;

        for (Tecnico tecnico : listaTecnico){
            if (Objects.equals(tecnico.getNome(), nomeDoTecnico)) {
                tecnicoEncontrado = tecnico;
                break;
            }
        }

        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|         Resultado da Busca        |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        if (tecnicoEncontrado == null){
            System.out.println(CoresTerminal.VERMELHO + "Aluno técnico com o nome '" + nomeDoTecnico + "' não foi encontrado.");
        } else {
            System.out.println(CoresTerminal.AMARELO + "Nome: " + CoresTerminal.RESET + CoresTerminal.VERDE + tecnicoEncontrado.getNome());
            System.out.println(CoresTerminal.AMARELO + "Idade: " + CoresTerminal.RESET + CoresTerminal.VERDE + tecnicoEncontrado.getIdade());
            System.out.println(CoresTerminal.AMARELO + "Sexo: " + CoresTerminal.RESET + CoresTerminal.VERDE + tecnicoEncontrado.getSexo());
            System.out.println(CoresTerminal.AMARELO + "Curso: " + CoresTerminal.RESET + CoresTerminal.VERDE + tecnicoEncontrado.getCurso());
            System.out.println(CoresTerminal.AMARELO + "Matricula: " + CoresTerminal.RESET + CoresTerminal.VERDE + tecnicoEncontrado.isMatricula());
            System.out.println(CoresTerminal.AMARELO + "Registro Profissional: " + CoresTerminal.RESET + CoresTerminal.VERDE + tecnicoEncontrado.getRegistroProfissional());
        }
        System.out.println(CoresTerminal.AZUL + "|===================================|");
    }
    public static void visualizarDadosVisitante(Scanner scanner, ArrayList<Visitante> listaVisitante){
        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|        Visualizar Visitante       |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        System.out.println(CoresTerminal.AZUL + "Qual Visitante deseja visualizar? (Digite o nome)");
        String nomeDoVisitante = scanner.nextLine();

        Visitante visitanteEncontrado = null;

        for (Visitante visitante : listaVisitante){
            if (Objects.equals(visitante.getNome(), nomeDoVisitante)) {
                visitanteEncontrado = visitante;
                break;
            }
        }

        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|         Resultado da Busca        |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        if (visitanteEncontrado == null){
            System.out.println(CoresTerminal.VERMELHO + "Visitante com o nome '" + nomeDoVisitante + "' não foi encontrado.");
        } else {
            System.out.println(CoresTerminal.AMARELO + "Nome: " + CoresTerminal.RESET + CoresTerminal.VERDE + visitanteEncontrado.getNome());
            System.out.println(CoresTerminal.AMARELO + "Idade: " + CoresTerminal.RESET + CoresTerminal.VERDE + visitanteEncontrado.getIdade());
            System.out.println(CoresTerminal.AMARELO + "Sexo: " + CoresTerminal.RESET + CoresTerminal.VERDE + visitanteEncontrado.getSexo());
        }
        System.out.println(CoresTerminal.AZUL + "|===================================|");
    }

    public static int confirmarLeitura(Scanner scanner){
        int continuarVisualizacao = 0;
        System.out.print( CoresTerminal.AMARELO + "Deseja visualizar outra entidade? (s/n) ");
        char escolha = scanner.next().charAt(0);
        scanner.nextLine();
        if (escolha == 'n') {
            System.out.println(CoresTerminal.VERDE + "Retornando ao menu principal!!");
            continuarVisualizacao = 6;
        }
        return continuarVisualizacao;
    }

}
