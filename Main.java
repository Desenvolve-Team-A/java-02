
import java.util.Scanner;

public class Main {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    menu();

  }

  private static void menu() {
    String nome = "";
    float valor = 0;
    String extenso = "";
    String data = "";

    draw();
    nome = name();
    drawComplete(nome, extenso, data, valor);
    valor = entradaMontante();
    extenso = extenso(valor);
    drawComplete(nome, extenso, data, valor);
    data = date();
    drawComplete(nome, extenso, data, valor);
  }

  private static void draw() {
    System.out.println("|:---------------------------------------------------------------------------------------:|");
    System.out.println("| Cheque n0182 | Comp | Banco | Agencia | C1 |  Conta  |   | Cheque N | C3 | R$           |");
    System.out.println("|              | 018  |  777  |   0444  | 02 | 6780913 | A |   0182   | 00 |              |");
    System.out.println("|              | Pago por este                                                            |");
    System.out.println("|              | cheque a quantia de                                                      |");
    System.out.println("|              | a                           ou a sua ordem                               |");
    System.out.println("|              | BANCO                  Blumenau,                                         |");
    System.out.println("|              | AGENCIA                                                                  |");
    System.out.println("|              |                                                       ASSINATURA         |");
    System.out.println("|:---------------------------------------------------------------------------------------:|");

  }

  private static void drawComplete(String nome, String extenso, String data, float valor) {
    System.out.println("|:-----------------------------------------------------------------------------------------:|");
    System.out.println("| Cheque n0182 | Comp | Banco | Agência | C1 |  Conta  |   | Cheque N | C3 | R$ " + valor);
    System.out.println("|              | 018  |  777  |   0444  | 02 | 6780913 | A |   0182   | 00 |              |");
    System.out.println("|              | Pago por este                                                            |");
    System.out.println("|              | cheque a quantia de " + extenso);
    System.out.println("|              | a " + nome + "              ou a sua ordem                               |");
    System.out.println("|              | BANCO                  Blumenau, " + data);
    System.out.println("|              | AGENCIA                                                                  |");
    System.out.println("|              |                                                       ASSINATURA         |");
    System.out.println("|:---------------------------------------------------------------------------------------:|");

  }

  private static float entradaMontante() {

    while (true) {
      System.out.print("Informe um valor para o cheque que seja entre R$00.01 a R$99.99: ");
      float floatInput = scanner.nextFloat();

      if (floatInput > 0.00 && floatInput < 100.00) {
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

    if (array[0] != 1 && array[0] != 0 && array[1] != 0) {
      finalString += "e ";
    }

    if (array[0] != 1) {
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
    } else if (array[0] != 0) {
      finalString += "reais ";
    }

    if (array[2] != 0) {
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

    if (array[2] != 1 && array[3] != 0) {
      finalString += "e ";
    }

    if (array[2] != 1) {
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
    } else if (array[3] >= 2 || array[2] != 0 && array[3] == 0) {
      finalString += "centavos ";
    }

    return finalString;
  }

  private static String name() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome completo: ");
    String nome = scanner.nextLine().trim();

    if (!nome.matches("[a-zA-ZÀ-ÿ\\s'?]+") || nome.split("\\s+").length < 2) {
      System.out.println("Erro! Digite um nome válido.");
      return name();
    }
    return nome;
  }

  private static String date() {
    Scanner scannerDate = new Scanner(System.in);
    String date = "";

    while (date == "") {
      System.out.println("Informe a data: Ex: 00/00/0000 ");
      String inputDate = scannerDate.nextLine();

      if (!inputDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
        System.out.println("Entrada invalida, digite a data no formato indicado");
      } else {
        String[] splitedInputdate = inputDate.trim().split("/");

        int day = Integer.parseInt(splitedInputdate[0]);
        int month = Integer.parseInt(splitedInputdate[1]);
        int year = Integer.parseInt(splitedInputdate[2]);

        if (year < 1900 || year > 2100) {
          System.out.println("Ano informado fora do periodo permitido! (De 1900 a 2100)");
        } else if (month < 1 || month > 12) {
          System.out.println("Mes informado não existe, favor informe um mes entre 1 e 12");
        } else {
          if (month == 2) {
            if (day < 1 || day > 28) {
              System.out.println("Dia informado nao existe para o mes");
            } else {
              date = String.valueOf(day) + " de Fevereiro de " + String.valueOf(year);
            }
          }
          if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 1 || day > 30) {
              System.out.println("Dia informado nao existe para o mes");
            } else {
              switch (month) {
                case 4:
                  date = String.valueOf(day) + " de Abril de " + String.valueOf(year);
                  break;
                case 6:
                  date = String.valueOf(day) + " de Junho de " + String.valueOf(year);
                  break;
                case 9:
                  date = String.valueOf(day) + " de Setembro de " + String.valueOf(year);
                  break;
                case 11:
                  date = String.valueOf(day) + " de Novembro de " + String.valueOf(year);
                  break;

                default:
                  break;
              }

            }
          }
          if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
              || month == 12) {
            if (day < 1 || day > 31) {
              System.out.println("Dia informado nao existe para o mes");
            } else {
              switch (month) {
                case 1:
                  date = String.valueOf(day) + " de Janeiro de " + String.valueOf(year);
                  break;
                case 3:
                  date = String.valueOf(day) + " de Marco de " + String.valueOf(year);
                  break;
                case 5:
                  date = String.valueOf(day) + " de Maio de " + String.valueOf(year);
                  break;
                case 7:
                  date = String.valueOf(day) + " de Julho de " + String.valueOf(year);
                  break;
                case 8:
                  date = String.valueOf(day) + " de Agosto de " + String.valueOf(year);
                  break;
                case 10:
                  date = String.valueOf(day) + " de Outubro de " + String.valueOf(year);
                  break;
                case 12:
                  date = String.valueOf(day) + " de Dezembro de " + String.valueOf(year);
                  break;
                default:
                  break;
              }
            }
          }
        }
      }

    }
    return date;
  }

}
