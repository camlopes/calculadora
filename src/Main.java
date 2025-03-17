import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double primeiroNumero;
        String operador;
        double segundoNumero;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        primeiroNumero = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /, ^): ");
        operador = scanner.next();

        System.out.print("Digite o segundo número: ");
        segundoNumero = scanner.nextDouble();

        switch(operador){
            case "+" -> System.out.println(primeiroNumero + segundoNumero);
            case "-" -> System.out.println(primeiroNumero - segundoNumero);
            case "*" -> System.out.println(primeiroNumero * segundoNumero);
            case "/" -> {
                if(segundoNumero == 0){
                    System.out.println("Impossível dividir por 0.");
                } else {
                    System.out.println(primeiroNumero / segundoNumero);
                }
            }
            case "^" -> System.out.println(Math.pow(primeiroNumero, segundoNumero));
            default -> System.out.println("Operador inválido.");
        }

        scanner.close();
    }
}