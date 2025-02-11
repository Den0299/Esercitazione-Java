import java.util.Scanner;

public class Switch1Advanced {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero= scanner.nextInt();

        String result= giornoSettimana (numero);
        System.out.println(result);
    }

    public static String giornoSettimana (int numero) {
        switch (numero) {
            case 1:
                return "Lunedì";
            case 2:
                return "Martedì";
            case 3:
                return "Mercoledì";
            case 4:
                return "Giovedì";
            case 5:
                return "Venerdì";
            case 6:
                return "Sabato";
            case 7:
                return "Domenica";
            default:
                return "Errore";

        }
    }
}
