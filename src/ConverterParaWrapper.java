/**
 * @author felipe.espinoza
 * @version 1.0
 */

import java.util.Scanner;

public class ConverterParaWrapper {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int numeroInserido;

        System.out.println("Informe um número entre 1 e 10: ");

        numeroInserido = ler.nextInt();
        System.out.println(numeroInserido + " é do tipo primitivo int\n");

        Integer valorConvertido = numeroInserido;
        System.out.println("O valor " + valorConvertido + " foi convertido para a classe wrapper Integer\n");
    }
}
