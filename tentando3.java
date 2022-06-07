import java.util.Scanner;
import java.util.Random;

public class tentando3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean vetorCriado = false;

        int vetor[] = new int[0];
        int opcao;
        int tamVet;
        do {

            opcao = MenuPrincipal();
            if (opcao != 0) {
                if (opcao == 1) {
                    System.out.println("     CRIAR UM VETOR");
                    System.out.print("Informe o tamanho do vetor a ser operado: ");
                    tamVet = in.nextInt();
                    vetor = new int[tamVet];
                    vetorCriado = true;
                }
                if (opcao == 2) {
                    System.out.println("     PREENCHER O VETOR");
                    if (vetorCriado == true) {
                        System.out.print("Informe o Valor Maximo para as posições: ");
                        int MaxValor = in.nextInt();

                        for (int pos = 0; pos < vetor.length; pos++) {
                            vetor[pos] = rnd.nextInt(MaxValor);
                        }
                    } else
                        System.out.println("Você Não Criou um Vetor");
                }
                if (opcao == 3) {
                    System.out.println("     LISTAGEM DO VETOR");
                    if (vetorCriado == true) {
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.println("|        Opções de Listagem:       |");
                        System.out.println("| 1 - Listar todos                 |");
                        System.out.println("| 2 - Listar acima da média        |");
                        System.out.println("| 3 - Escolher media               |");
                        System.out.println("| 0 - Retornar ao Menu Principal   |");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.print("   Escolha a Listagem: ");
                        int opcList;
                        opcList = in.nextInt();
                        if (opcList == 1) {
                            for (int pos = 0; pos < vetor.length; pos++) {
                                System.out.println("vet[" + pos + "]: " + vetor[pos]);
                            }
                        }
                        if (opcList == 2) {
                            int somaVetor = 0;
                            double mediaVetor = 0;
                            for (int pos = 0; pos < vetor.length; pos++) {
                                somaVetor += vetor[pos];
                            }
                            mediaVetor = somaVetor / vetor.length;

                            System.out.println("A media é: " + mediaVetor);

                            for (int pos = 0; pos < vetor.length; pos++) {
                                if (vetor[pos] > mediaVetor) {
                                    System.out.println("vet[" + pos + "]: " + vetor[pos]);
                                }
                            }
                        }
                        if (opcList == 3) {
                            System.out.print("Informe o valor: ");
                            int valorSele = in.nextInt();
                            for (int pos = 0; pos < vetor.length; pos++) {
                                if (vetor[pos] > valorSele) {
                                    System.out.println("vet[" + pos + "]: " + vetor[pos]);
                                }
                            }
                        }
                    } else
                        System.out.println("Você Não Criou um Vetor");
                }
                if (opcao == 4) {
                    if (vetorCriado == true) {
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.println("|        Opções de Ordenação       |");
                        System.out.println("| 1 - Ordem Crescente              |");
                        System.out.println("| 2 - Ordem Decrescente            |");
                        System.out.println("| 0 - Retornar ao Menu Principal   |");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.print("   Escolha a Ordenação: ");
                        int opcOrd = in.nextInt();
                        int aux = 0;

                        if (opcOrd == 1) {
                            for (int i = 0; i < vetor.length; i++) {
                                for (int j = 0; j < vetor.length; j++) {
                                    if (vetor[i] < vetor[j]) {
                                        aux = vetor[i];
                                        vetor[i] = vetor[j];
                                        vetor[j] = aux;
                                    }
                                }
                            }
                            for (int pos = 0; pos < vetor.length; pos++) {
                                System.out.println("vet[" + pos + "]: " + vetor[pos]);
                            }
                        }
                        if (opcOrd == 2) {
                            for (int i = 0; i < vetor.length; i++) {
                                for (int j = 0; j < vetor.length; j++) {
                                    if (vetor[i] > vetor[j]) {
                                        aux = vetor[i];
                                        vetor[i] = vetor[j];
                                        vetor[j] = aux;
                                    }
                                }
                            }
                            for (int pos = 0; pos < vetor.length; pos++) {
                                System.out.println("vet[" + pos + "]: " + vetor[pos]);
                            }
                        }
                    } else
                        System.out.println("Você Não Criou um Vetor");
                }
                if (opcao == 5) {
                    if (vetorCriado == true) {
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.println("|          Picos do Vetor          |");
                        System.out.println("| 1 - Valor Máximo                 |");
                        System.out.println("| 2 - Valor Mínimo                 |");
                        System.out.println("| 0 - Retornar ao Menu Principal   |");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.print("   Escolha: ");
                        int opcPico = in.nextInt();
                        int nuMax = 0;
                        int posMax = 0;
                        int nuMin = vetor[0];
                        int posMin = 0;
                        if (opcPico == 1) {
                            for (int pos = 0; pos < vetor.length; pos++) {
                                if (vetor[pos] > nuMax) {
                                    nuMax = vetor[pos];
                                    posMax = pos;
                                }
                            }
                            System.out.println(
                                    "O Pico Máximo do valor é: " + nuMax + ", e sua posição é: [" + posMax + "]");
                        }
                        if (opcPico == 2) {
                            for (int pos = 0; pos < vetor.length; pos++) {
                                if (vetor[pos] < nuMin) {
                                    nuMin = vetor[pos];
                                    posMin = pos;
                                }
                            }
                            System.out.println(
                                    "O Pico Mínimo do valor é: " + nuMin + ", e sua posição é: [" + posMin + "]");
                        }

                    } else
                        System.out.println("Você Não Criou um Vetor");
                }

            } else {
                // System.out.println(" A opcao " + opcao + " não eh valida");
            }
        } while (opcao != 0);
        System.out.println("          Fim do Programa");
    }

    public static int MenuPrincipal() {
        Scanner MenuPrin = new Scanner(System.in);
        int opcMenu;

        do {

            System.out.println("-------------------------------------------");
            System.out.println("|        Tela do menu principal           |");
            System.out.println("|  Opções:                                |");
            System.out.println("|  1 - Criar um Vetor                     |");
            System.out.println("|  2 - Preenchar o Vetor                  |");
            System.out.println("|  3 - Listar o Vetor                     |");
            System.out.println("|  4 - Ordenar os Vetores                 |");
            System.out.println("|  5 - Picos                              |");
            System.out.println("|  0 - Sair do Programa                   |");
            System.out.println("-------------------------------------------");
            System.out.print(" Opcao desejado: ");

            opcMenu = MenuPrin.nextInt();
            if ((opcMenu >= 0) && (opcMenu <= 5)) {
                return opcMenu;
            } else {
                System.out.println("VOCÊ SELECIONOU UMA OPÇÃO INVALIDA! TENTE NOVAMENTE!");
            }
        } while (true);
    }
}
