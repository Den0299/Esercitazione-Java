/* crivi un programma Java dove imposti 2 BigDecimal e
1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e divisione, min e max)
definita in un enum.
Crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo */


import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExe {
    public static void main(String[] args) {
        // Definizione dei due BigDecimal
        BigDecimal num1 = new BigDecimal("10.5");
        BigDecimal num2 = new BigDecimal("5.25");

        // Array di operazioni
        Operation[] operations = Operation.values();

        // Iterazione su tutte le operazioni
        for (Operation op : operations) {
            BigDecimal result = calcola(num1, num2, op);
            System.out.println("Operazione: " + op);
            System.out.println("Numero 1: " + num1);
            System.out.println("Numero 2: " + num2);
            System.out.println("Risultato: " + result);
            System.out.println("------------------------");
        }
    }

    public enum Operation {
        ADDIZIONE,
        SOTTRAZIONE,
        MOLTIPLICAZIONE,
        DIVISIONE,
        MIN,
        MAX
    }

    public static BigDecimal calcola(BigDecimal num1, BigDecimal num2, Operation operazione) {
        return switch (operazione) {
            case ADDIZIONE -> num1.add(num2);
            case SOTTRAZIONE -> num1.subtract(num2);
            case MOLTIPLICAZIONE -> num1.multiply(num2);
            case DIVISIONE -> {
                // Gestione della divisione per zero
                if (num2.compareTo(BigDecimal.ZERO) == 0) {
                    throw new ArithmeticException("Divisione per zero");
                }
                yield num1.divide(num2, 10, RoundingMode.HALF_UP);
            }
            case MIN -> num1.min(num2);
            case MAX -> num1.max(num2);
            default -> throw new IllegalArgumentException("Operazione non supportata");
        };
    }
}


// metodo simile
        /*public static BigDecimal calculate(Operation operation, BigDecimal num1, BigDecimal num2) {
        BigDecimal result = BigDecimal.ZERO;

        switch (operation) {
            case ADDIZIONE:
                result = num1.add(num2);
                break;
            case SOTTRAZIONE:
                result = num1.subtract(num2);
                break;
            case MOLTIPLICAZIONE:
                result = num1.multiply(num2);
                break;
            case DIVISIONE:
                if (num2.compareTo(BigDecimal.ZERO) != 0) {
                    result = num1.divide(num2, 2, RoundingMode.HALF_UP);
                } else {
                    System.out.println("Errore: Divisione per zero.");
                }
                break;
            case MIN:
                result = num1.min(num2);
                break;
            case MAX:
                result = num1.max(num2);
                break;
        }
        return result;
    }*/