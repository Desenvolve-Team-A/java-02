
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        cheque();

    }

    private static void cheque() {

        menu();

    }

    private static void menu() {

        draw();
        extenso(entradaMontante());
        name();
        date();

    }

    private static void draw() {
    	System.out.println("|:---------------------------------------------------------------------------------------:|");
    	System.out.println("| Cheque n0182 | Comp | Banco | Agencia | C1 |  Conta  |   | Cheque N | C3 | R$           |");
    	System.out.println("|              | 018  |  777  |   0444  | 02 | 6780913 | A |   0182   | 00 | "/*VALOR*/     );
    	System.out.println("|              |                                                                          |");
    	System.out.println("|              | Pago por este cheque a quantia de "/*VALOR POR EXTENSO*/                   );
    	System.out.println("|              | a " /*NOME PESSOA*/+ "ou a sua ordem"                                      );
    	System.out.println("|              | BANCO                  Blumenau" /*DIA*/+" de "/*MES*/+" de"/*ANO*/        );
    	System.out.println("|              | AGENCIA                                       "/*ASSINATURA*/              );
    	System.out.println("|              |                                                       ASSINATURA         |");
    	System.out.println("|:---------------------------------------------------------------------------------------:|");
    }

    private static float entradaMontante() {

        while(true){
            System.out.print("Informe um valor para o cheque que seja entre R$00.01 a R$99.99: ");
            float floatInput = scanner.nextFloat();

            if(floatInput > 0.00 && floatInput < 100.00){
                return floatInput;
            }
        }

    }

    private static String extenso(float input) {

        String inputNumber = String.format("%.2f", input);
        inputNumber = inputNumber.replace(",", "");
        String finalString = "";

        int[] array = new int[inputNumber.length()];

        for (int i = 0; i < inputNumber.length(); i++) {
            array[i] = Character.getNumericValue(inputNumber.charAt(i));
        }

        if (array[0] == 1) {
            switch (array[1]) {
                case 0:
                    finalString += "dez ";
                    break;

                case 1:
                    finalString += "onze ";
                    break;

                case 2:
                    finalString += "doze ";
                    break;

                case 3:
                    finalString += "treze ";
                    break;

                case 4:
                    finalString += "quatorze ";
                    break;

                case 5:
                    finalString += "quinze ";
                    break;

                case 6:
                    finalString += "dezesseis ";
                    break;

                case 7:
                    finalString += "dezessete ";
                    break;

                case 8:
                    finalString += "dezoito ";
                    break;

                case 9:
                    finalString += "dezenove ";
                    break;

                default:
                    break;
            }

        } else if (array[0] != 0) {
            switch (array[0]) {
                case 2:
                    finalString += "vinte ";
                    break;

                case 3:
                    finalString += "trinta ";
                    break;

                case 4:
                    finalString += "quarenta ";
                    break;

                case 5:
                    finalString += "cinquenta ";
                    break;

                case 6:
                    finalString += "sessenta ";
                    break;

                case 7:
                    finalString += "setenta ";
                    break;

                case 8:
                    finalString += "oitenta ";
                    break;

                case 9:
                    finalString += "noventa ";
                    break;

                default:
                    break;
            }
        }

        if (array[0] != 1 && array[0] != 0){
            finalString += "e ";
        }

        if (array[0] != 1){
            switch (array[1]) {
                case 1:
                    finalString += "um ";
                    break;

                case 2:
                    finalString += "dois ";
                    break;

                case 3:
                    finalString += "três ";
                    break;

                case 4:
                    finalString += "quatro ";
                    break;

                case 5:
                    finalString += "cinco ";
                    break;

                case 6:
                    finalString += "seis ";
                    break;

                case 7:
                    finalString += "sete ";
                    break;

                case 8:
                    finalString += "oito ";
                    break;

                case 9:
                    finalString += "nove ";
                    break;

                default:
                    break;
            }
        }

        if (array[0] == 0 && array[1] == 1) {
            finalString += "real ";
        } else if (array[0] != 0 && array[1] != 0) {
            finalString += "reais ";
        }

        if (array[2] != 0){
            finalString += "e ";

            if (array[2] == 1) {
                switch (array[3]) {
                    case 0:
                        finalString += "dez ";
                        break;

                    case 1:
                        finalString += "onze ";
                        break;

                    case 2:
                        finalString += "doze ";
                        break;

                    case 3:
                        finalString += "treze ";
                        break;

                    case 4:
                        finalString += "quatorze ";
                        break;

                    case 5:
                        finalString += "quinze ";
                        break;

                    case 6:
                        finalString += "dezesseis ";
                        break;

                    case 7:
                        finalString += "dezessete ";
                        break;

                    case 8:
                        finalString += "dezoito ";
                        break;

                    case 9:
                        finalString += "dezenove ";
                        break;

                    default:
                        break;
                }

            } else {
                switch (array[2]) {
                    case 2:
                        finalString += "vinte ";
                        break;

                    case 3:
                        finalString += "trinta ";
                        break;

                    case 4:
                        finalString += "quarenta ";
                        break;

                    case 5:
                        finalString += "cinquenta ";
                        break;

                    case 6:
                        finalString += "sessenta ";
                        break;

                    case 7:
                        finalString += "setenta ";
                        break;

                    case 8:
                        finalString += "oitenta ";
                        break;

                    case 9:
                        finalString += "noventa ";
                        break;

                    default:
                        break;
                }
            }
        }

        if (array[2] != 1 && array[3] != 0){
            finalString += "e ";
        }

        if (array[2] != 1){
            switch (array[3]) {
                case 1:
                    finalString += "um ";
                    break;

                case 2:
                    finalString += "dois ";
                    break;

                case 3:
                    finalString += "três ";
                    break;

                case 4:
                    finalString += "quatro ";
                    break;

                case 5:
                    finalString += "cinco ";
                    break;

                case 6:
                    finalString += "seis ";
                    break;

                case 7:
                    finalString += "sete ";
                    break;

                case 8:
                    finalString += "oito ";
                    break;

                case 9:
                    finalString += "nove ";
                    break;

                default:
                    break;
            }
        }

        if (array[2] == 0 && array[3] == 1) {
            finalString += "centavo ";
        } else if (array[2] != 0 && array[3] != 0) {
            finalString += "centavos ";
        }

        return finalString;
    }

    private static void name() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        //Fazer validação

    }
    

    private static void date() {
    }
    

}
