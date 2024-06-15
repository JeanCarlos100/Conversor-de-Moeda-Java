

import java.io.IOException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        ConvesteValor convesteValor ;

        int opcao;
        double moeda;

        while (true){

            System.out.println("""
                    ****************Convesto de Moeda*********************
                    Escolha a opção de corveção de moeda
                    
                        1- Real brasileiro para Dólar americano
                        2- Real brasileiro para Euro
                        3- Dólar americano para Real brasileiro
                        4- Euro para Real brasileiro
                        5- Dólar americano para Euro
                        6- Euro para Dólar americano
                        7- Sair
                    *****************************************************
                    """);
            opcao = entrada.nextInt();
            if (opcao >0 && opcao <7){
                System.out.println("Digite quantos em dinheiro você que conveste: ");
                moeda = entrada.nextDouble();
                convesteValor = new ConvesteValor(opcao,moeda);
                System.out.println("O valor de "+moeda+" Convestido é: "+convesteValor.calcularMoeda());
                System.out.println();

                scanner.nextLine();

            } else if (opcao == 7) {
                System.out.println("Fim do Programa!\n");
                System.out.println("********************fim******************");
                break;
            }else {
                System.out.println("Valor invalidor!");
                System.out.println();
                scanner.nextLine();
            }

        }
        entrada.close();
        scanner.close();
    }


}
