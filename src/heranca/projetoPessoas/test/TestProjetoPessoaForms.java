package heranca.projetoPessoas.test;
import heranca.projetoPessoas.*;
import utilidades.CoresTerminal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TestProjetoPessoaForms {
    public void TesteProjetoEscolaForms(){
        Scanner scanner = new Scanner(System.in);
        int opMenuPrincipal, opMenuCadastro, opMenuVisualizar;
        boolean menuCadastro = true, menuPrincipal = true, menuDados = true; // boolean salvar = false; // usado para salvar o objeto

        // Listas para armazenar os dados:
        ArrayList<Professor> listaProfessor = new ArrayList<Professor>();
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        ArrayList<Bolsista> listaBolsista = new ArrayList<Bolsista>();
        ArrayList<Tecnico> listaTecnico = new ArrayList<Tecnico>();
        ArrayList<Visitante> listaVisitante = new ArrayList<Visitante>();

        // Estanciando a classe CadastrarService e a classe VisualizarService:
        CadastrarService cadastrarService = new CadastrarService();
        VisualizarService visualizarService = new VisualizarService();

        do {
            System.out.println(CoresTerminal.AZUL + "|===================================|");
            System.out.println(CoresTerminal.AZUL + "|         Sistema de Gestão         |");
            System.out.println(CoresTerminal.AZUL + "|===================================|");

            System.out.println(CoresTerminal.AMARELO + "       1 - Cadastrar Entidades");
            System.out.println(CoresTerminal.AMARELO + "       2 - Visualizar Dados");
            System.out.println(CoresTerminal.AMARELO + "       3 - Sair do menu");
            System.out.print(CoresTerminal.VERDE + "Selecione uma opção: ");

            try{
                opMenuPrincipal = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(CoresTerminal.VERMELHO + "Erro: Digite apenas números para a opção.");
                scanner.nextLine(); // Limpa o buffer
                opMenuPrincipal = 0; // Define uma opção inválida para ir ao 'default'
            }
            scanner.nextLine(); // tirar o buffer da memória

            switch (opMenuPrincipal){
                case 1:
                    // Menu para o Cadastro das entidades (Professor, Aluno, Tecnico, Bolsista, Visitante)
                    // Feito completamente e otimizado!!

                    menuCadastro = true; // Serve para resetar a variavel quando sair do menu de cadastro para que quando for finalizado um cadastro ele não feche o menu de cadastro e siga aberto.
                    do {
                        System.out.println(CoresTerminal.AZUL + "|===================================|");
                        System.out.println(CoresTerminal.AZUL + "|        Cadastro de pessoas        |");
                        System.out.println(CoresTerminal.AZUL + "|===================================|");

                        System.out.println(CoresTerminal.AMARELO + "       1 - Cadastrar Professor");
                        System.out.println(CoresTerminal.AMARELO + "       2 - Cadastrar Aluno");
                        System.out.println(CoresTerminal.AMARELO + "       3 - Cadastrar Bolsista");
                        System.out.println(CoresTerminal.AMARELO + "       4 - Cadastrar Técnico");
                        System.out.println(CoresTerminal.AMARELO + "       5 - Cadastrar Visitante");
                        System.out.println(CoresTerminal.AMARELO + "       6 - Sair do menu");
                        System.out.print(CoresTerminal.VERDE + "Selecione uma opção: ");

                        try{
                            opMenuCadastro = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println(CoresTerminal.VERMELHO + "Erro: Digite apenas números para a opção.");
                            scanner.nextLine(); // Limpa o buffer
                            opMenuCadastro = 0; // Define uma opção inválida para ir ao 'default'
                        }
                        scanner.nextLine(); // tirar o buffer da memória


                        switch (opMenuCadastro) {
                            case 0:
                                System.out.println(CoresTerminal.BRANCO + "Loading.... Menu sendo carregado!");
                                break;
                            case 1:
                                // Feito!
                                CadastrarService.cadastrarProfessor(scanner, listaProfessor);
                                opMenuCadastro = CadastrarService.continuarCadastro(scanner);
                                break;
                            case 2:
                                // Feito!
                                CadastrarService.cadastrarAluno(scanner, listaAluno);
                                opMenuCadastro = CadastrarService.continuarCadastro(scanner);
                                break;
                            case 3:
                                // Feito!
                                CadastrarService.cadastrarBolsista(scanner, listaBolsista);
                                opMenuCadastro = CadastrarService.continuarCadastro(scanner);
                                break;
                            case 4:
                                // Feito!
                                CadastrarService.cadastrarTecnico(scanner, listaTecnico);
                                opMenuCadastro = CadastrarService.continuarCadastro(scanner);
                                break;
                            case 5:
                                // Feito!
                                CadastrarService.cadastrarVisitante(scanner, listaVisitante);
                                opMenuCadastro = CadastrarService.continuarCadastro(scanner);
                                break;
                            case 6:
                                menuCadastro = false; // Encerra o loop
                                System.out.println(CoresTerminal.VERMELHO + "Saindo do sistema de cadastro... Até mais!");
                                break;
                            default:
                                System.out.println("Entrada inválida");
                                break;
                        }
                    } while(menuCadastro);
                    break;
                case 2:
                    // Menu para visualizar as entidades (Professor, Aluno, Tecnico, Bolsista, Visitante)
                    menuDados = true; // Serve para resetar a variavel quando sair do menu de visualização para que quando for finalizado um visualização ele não feche o menu de cadastro e siga aberto.
                    do{
                        System.out.println(CoresTerminal.AZUL + "|===================================|");
                        System.out.println(CoresTerminal.AZUL + "|      Visualizar de Entidades      |");
                        System.out.println(CoresTerminal.AZUL + "|===================================|");

                        System.out.println(CoresTerminal.AMARELO + "       1 - Visualizar Professor");
                        System.out.println(CoresTerminal.AMARELO + "       2 - Visualizar Aluno");
                        System.out.println(CoresTerminal.AMARELO + "       3 - Visualizar Bolsista");
                        System.out.println(CoresTerminal.AMARELO + "       4 - Visualizar Técnico");
                        System.out.println(CoresTerminal.AMARELO + "       5 - Visualizar Visitante");
                        System.out.println(CoresTerminal.AMARELO + "       6 - Sair do menu");
                        System.out.print(CoresTerminal.VERDE + "Selecione uma opção: ");

                        try{
                            opMenuVisualizar = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println(CoresTerminal.VERMELHO + "Erro: Digite apenas números para a opção.");
                            scanner.nextLine(); // Limpa o buffer
                            opMenuVisualizar = 0; // Define uma opção inválida para ir ao 'default'
                        }
                        scanner.nextLine(); // tirar o buffer da memória

                        switch (opMenuVisualizar){
                            case 0:
                                System.out.println(CoresTerminal.BRANCO + "Loading.... Menu sendo carregado!");
                                break;
                            case 1:
                                // Feito!
                                VisualizarService.visualizarDadosProfessor(scanner, listaProfessor);
                                opMenuVisualizar = VisualizarService.confirmarLeitura(scanner);
                                break;
                            case 2:
                                // Feito!
                                VisualizarService.visualizarDadosAluno(scanner, listaAluno);
                                opMenuVisualizar = VisualizarService.confirmarLeitura(scanner);
                                break;
                            case 3:
                                // Feito!
                                VisualizarService.visualizarDadosBolsista(scanner, listaBolsista);
                                opMenuVisualizar = VisualizarService.confirmarLeitura(scanner);
                                break;
                            case 4:
                                // Feito!
                                VisualizarService.visualizarDadosTecnico(scanner, listaTecnico);
                                opMenuVisualizar = VisualizarService.confirmarLeitura(scanner);
                                break;
                            case 5:
                                // Feito!
                                VisualizarService.visualizarDadosVisitante(scanner, listaVisitante);
                                opMenuVisualizar = VisualizarService.confirmarLeitura(scanner);
                                break;
                            case 6:
                                menuDados = false;
                                System.out.println(CoresTerminal.VERMELHO + "Saindo do sistema de visualização....Até!");
                                break;
                            default:
                                System.out.println(CoresTerminal.VERMELHO + "Entrada inválida... valores possíveis 1 a 6!");
                                break;
                        }

                    } while (menuDados);
                    break;
                case 3:
                    menuPrincipal = false;
                    System.out.println(CoresTerminal.VERMELHO + "Saindo do sistema de cadastro... Até mais!");
                    break;
                default:
                    System.out.println(CoresTerminal.VERMELHO + "Entrada inválida. Digite um número de 1 a 3.");
                    break;
            }
        } while(menuPrincipal); // roda o menu enquanto for true

    }

}
