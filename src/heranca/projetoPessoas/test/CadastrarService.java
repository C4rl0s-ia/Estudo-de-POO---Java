package heranca.projetoPessoas.test;

import heranca.projetoPessoas.*;
import utilidades.CoresTerminal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastrarService {
    public static void cadastrarProfessor (Scanner scanner, ArrayList<Professor> listaProfessor){
        System.out.println();
        Professor professor = new Professor();
        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|       Cadastro de Professor       |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        try{
            // Parte de Pessoa
            preencherDadosPessoa(professor, scanner, "Professor");

            // Parte do Professor
            System.out.print(CoresTerminal.AMARELO + "Qual seu especialidade: ");
            String especialidadeProfessor = scanner.nextLine();
            professor.setEspecialidade(especialidadeProfessor);
            System.out.print(CoresTerminal.AMARELO + "Qual o salário atual: ");
            float salarioProfessor = scanner.nextFloat();
            professor.setSalario(salarioProfessor);
            scanner.nextLine(); // tirar o buffer da memória

        } catch (InputMismatchException e) {
            System.out.println(CoresTerminal.VERMELHO + "Erro: tipo de dado inválido. Digite os valores corretamente!");
            scanner.nextLine(); // limpa o buffer após o erro
            return;
        } catch (Exception e) {
            System.out.println(CoresTerminal.VERMELHO + "Ocorreu um erro inesperado: " + e.getMessage());
            return;
        }

        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|          Revisão de dados         |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        System.out.println(CoresTerminal.CIANO + "    ID do professor: " + listaProfessor.size());
        System.out.println(CoresTerminal.CIANO + "    Nome: " + professor.getNome());
        System.out.println(CoresTerminal.CIANO + "    Idade: " + professor.getIdade());
        System.out.println(CoresTerminal.CIANO + "    Sexo: " + professor.getSexo());
        System.out.println(CoresTerminal.CIANO + "    Especialidade: " + professor.getEspecialidade());
        System.out.println(CoresTerminal.CIANO + "    Salário: " + professor.getSalario());

        System.out.print(CoresTerminal.VERDE + "Você deseja registrar o professor " + professor.getNome() + "? (s/n)");
        char escolhaProfessor = scanner.next().charAt(0); // lê a resposta do usuário.
        scanner.nextLine(); // limpar buffer do enter.

        if (escolhaProfessor == 's') {
            System.out.println(CoresTerminal.AZUL + "Professor salvo em sistema!!");
            listaProfessor.add(professor);
        }
    }
    public static void cadastrarAluno (Scanner scanner, ArrayList<Aluno> listaAluno) {
        System.out.println();
        Aluno aluno = new Aluno();
        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|         Cadastro de Aluno         |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        try{
            // Parte da Pessoa
            preencherDadosPessoa(aluno, scanner, "Aluno");

            // Parte do Aluno
            preencherDadosAluno(aluno, scanner);

        } catch (InputMismatchException e) {
            System.out.println(CoresTerminal.VERMELHO + "Erro: tipo de dado inválido. Digite os valores corretamente!");
            scanner.nextLine(); // limpa o buffer após o erro
            return;
        } catch (Exception e) {
            System.out.println(CoresTerminal.VERMELHO + "Ocorreu um erro inesperado: " + e.getMessage());
            return;
        }

        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|          Revisão de dados         |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        System.out.println(CoresTerminal.CIANO + "    ID do Aluno: " + listaAluno.size());
        System.out.println(CoresTerminal.CIANO + "    Nome: " + aluno.getNome());
        System.out.println(CoresTerminal.CIANO + "    Idade: " + aluno.getIdade());
        System.out.println(CoresTerminal.CIANO + "    Sexo: " + aluno.getSexo());
        System.out.println(CoresTerminal.CIANO + "    Matricula: " + aluno.isMatricula());
        System.out.println(CoresTerminal.CIANO + "    Curso: " + aluno.getCurso());

        System.out.print(CoresTerminal.VERDE + "Você deseja registrar o aluno " + aluno.getNome() + "? (s/n)");
        char escolhaAluno = scanner.next().charAt(0); // lê a resposta do usuário.
        scanner.nextLine(); // limpar buffer do enter.

        if (escolhaAluno == 's') {
            System.out.println(CoresTerminal.AZUL + "Aluno salvo em sistema!!");
            listaAluno.add(aluno);
        }
    }
    public static void cadastrarBolsista (Scanner scanner, ArrayList<Bolsista> listaBolsista) {
        System.out.println();
        Bolsista bolsista = new Bolsista();
        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|        Cadastro de Bolsista       |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        try{
            // Parte de Pessoa
            preencherDadosPessoa(bolsista, scanner, "Bolsista");

            // Parte do aluno
            preencherDadosAluno(bolsista, scanner);

            // Parte do Bolsista
            System.out.println(CoresTerminal.AMARELO + "Qual a bolsa garantida: ");
            float bolsaBolsista = scanner.nextFloat();
            bolsista.setBolsa(bolsaBolsista);
            scanner.nextLine(); // tirar o buffer da memória

        } catch (InputMismatchException e) {
            System.out.println(CoresTerminal.VERMELHO + "Erro: tipo de dado inválido. Digite os valores corretamente!");
            scanner.nextLine(); // limpa o buffer após o erro
            return;
        } catch (Exception e) {
            System.out.println(CoresTerminal.VERMELHO + "Ocorreu um erro inesperado: " + e.getMessage());
            return;
        }

        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|          Revisão de dados         |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        System.out.println(CoresTerminal.CIANO + "    ID do Aluno Bolsista: " + listaBolsista.size());
        System.out.println(CoresTerminal.CIANO + "    Nome: " + bolsista.getNome());
        System.out.println(CoresTerminal.CIANO + "    Idade: " + bolsista.getIdade());
        System.out.println(CoresTerminal.CIANO + "    Sexo: " + bolsista.getSexo());
        System.out.println(CoresTerminal.CIANO + "    Matricula: " + bolsista.isMatricula());
        System.out.println(CoresTerminal.CIANO + "    Curso: " + bolsista.getCurso());
        System.out.println(CoresTerminal.CIANO + "    Bolsa: " + bolsista.getBolsa());

        System.out.print(CoresTerminal.VERDE + "Você deseja registrar o aluno " + bolsista.getNome() + "? (s/n)");
        char escolhaBolsista = scanner.next().charAt(0); // lê a resposta do usuário.

        scanner.nextLine(); // limpar buffer do enter.

        if (escolhaBolsista == 's') {
            System.out.println(CoresTerminal.AZUL + "Aluno Bolsista salvo em sistema!!");
            listaBolsista.add(bolsista);
        }
    }
    public static void cadastrarTecnico (Scanner scanner, ArrayList<Tecnico> listaTecnico) {
        System.out.println();
        Tecnico tecnico = new Tecnico();
        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|        Cadastro de Técnico        |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        try{
            // Parte de Pessoa
            preencherDadosPessoa(tecnico, scanner, "Tecnico");

            // Parte do aluno
            preencherDadosAluno(tecnico, scanner);

            // Parte do Bolsista
            System.out.println(CoresTerminal.AMARELO + "Qual o Registro Profissional do Aluno Técnico: ");
            String rgProfissionalTecnica = scanner.nextLine();
            tecnico.setRegistroProfissional(rgProfissionalTecnica);

        } catch (InputMismatchException e) {
            System.out.println(CoresTerminal.VERMELHO + "Erro: tipo de dado inválido. Digite os valores corretamente!");
            scanner.nextLine(); // limpa o buffer após o erro
            return;
        } catch (Exception e) {
            System.out.println(CoresTerminal.VERMELHO + "Ocorreu um erro inesperado: " + e.getMessage());
            return;
        }

        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|          Revisão de dados         |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        System.out.println(CoresTerminal.CIANO + "    ID do Aluno Técnico: " + listaTecnico.size());
        System.out.println(CoresTerminal.CIANO + "    Nome: " + tecnico.getNome());
        System.out.println(CoresTerminal.CIANO + "    Idade: " + tecnico.getIdade());
        System.out.println(CoresTerminal.CIANO + "    Sexo: " + tecnico.getSexo());
        System.out.println(CoresTerminal.CIANO + "    Matricula: " + tecnico.isMatricula());
        System.out.println(CoresTerminal.CIANO + "    Curso: " + tecnico.getCurso());
        System.out.println(CoresTerminal.CIANO + "    Registro Profissional: " + tecnico.getRegistroProfissional());

        System.out.print(CoresTerminal.VERDE + "Você deseja registrar o Aluno Técnico" + tecnico.getNome() + "? (s/n)");
        char escolhaTecnico = scanner.next().charAt(0); // lê a resposta do usuário.
        scanner.nextLine(); // limpar buffer do enter.

        if (escolhaTecnico == 's') {
            System.out.println(CoresTerminal.AZUL + "Aluno técnico salvo em sistema!!");
            listaTecnico.add(tecnico);
        }
    }
    public static void cadastrarVisitante (Scanner scanner, ArrayList<Visitante> listaVisitante) {
        System.out.println();
        Visitante visitante = new Visitante();
        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|       Cadastro de Visitante       |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        try{
            // Parte da Pessoa
            preencherDadosPessoa(visitante, scanner, "Visitante");

        } catch (InputMismatchException e) {
            System.out.println(CoresTerminal.VERMELHO + "Erro: tipo de dado inválido. Digite os valores corretamente!");
            scanner.nextLine(); // limpa o buffer após o erro
            return;
        } catch (Exception e) {
            System.out.println(CoresTerminal.VERMELHO + "Ocorreu um erro inesperado: " + e.getMessage());
            return;
        }

        System.out.println(CoresTerminal.AZUL + "|===================================|");
        System.out.println(CoresTerminal.AZUL + "|          Revisão de dados         |");
        System.out.println(CoresTerminal.AZUL + "|===================================|");

        System.out.println(CoresTerminal.CIANO + "    ID do Visitante: " + listaVisitante.size());
        System.out.println(CoresTerminal.CIANO + "    Nome: " + visitante.getNome());
        System.out.println(CoresTerminal.CIANO + "    Idade: " + visitante.getIdade());
        System.out.println(CoresTerminal.CIANO + "    Sexo: " + visitante.getSexo());

        System.out.print(CoresTerminal.VERDE + "Você deseja registrar o visitante" + visitante.getNome() + "? (s/n)");
        char escolhaVisitante = scanner.next().charAt(0); // lê a resposta do usuário.
        scanner.nextLine(); // limpar buffer do enter.

        if (escolhaVisitante == 's') {
            System.out.println(CoresTerminal.AZUL + "Visitante salvo em sistema!!");
            listaVisitante.add(visitante);
        }
    }

    public static int continuarCadastro(Scanner scanner){
        int continuarNoCadastro = 0;
        System.out.print( CoresTerminal.AMARELO + "Deseja cadastrar outra entidade? (s/n) ");
        char escolha = scanner.next().charAt(0);
        scanner.nextLine();

        if (escolha == 'n') {
            System.out.println(CoresTerminal.VERDE + "Retornando ao menu principal!!");
            continuarNoCadastro = 6;
        }
        return continuarNoCadastro;
    }

    // Para auxiliar nos métodos de cadastro
    private static void preencherDadosPessoa(Pessoa p, Scanner scanner, String tipoPessoa) throws InputMismatchException {
        System.out.print(CoresTerminal.AMARELO + "Digite o nome do " + tipoPessoa + ": ");
        String nome = scanner.nextLine();
        p.setNome(nome);

        System.out.print(CoresTerminal.AMARELO + "Digite a Idade do " + tipoPessoa + ": ");
        int idade = scanner.nextInt();
        p.setIdade(idade);
        scanner.nextLine(); // tirar o buffer da memória

        System.out.print(CoresTerminal.AMARELO + "Digite o sexo do " + tipoPessoa + ": ");
        String sexo = scanner.nextLine();
        p.setSexo(sexo);
    }
    /**
     * Preenche os dados básicos de um Aluno (Matricula, Curso).
     * @param a O objeto Aluno (ou subclasse) a ser preenchido.
     * @param scanner O Scanner para ler a entrada.
     * @throws InputMismatchException Se a matrícula não for um booleano.
     */
    private static void preencherDadosAluno(Aluno a, Scanner scanner) throws InputMismatchException {
        System.out.print(CoresTerminal.AMARELO + "A matricula está ativa: (true/false) ");
        boolean matricula = scanner.nextBoolean();
        a.setMatricula(matricula);
        scanner.nextLine(); // tirar o buffer da memória

        System.out.print(CoresTerminal.AMARELO + "Qual o curso do aluno: ");
        String curso = scanner.nextLine();
        a.setCurso(curso);
    }
}
