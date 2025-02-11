package Student; // Nome do pacote corrigido

public class WhileCommand {
    public static void main(String[] args) {
        System.out.println("While Loop Example:");
        exampleWhile();

        System.out.println("\nDo-While Loop Example:");
        exampleDoWhile();

        System.out.println("\nFor Loop Example:");
        exampleFor();
    }

    // While loop example
    public static void exampleWhile() {
        int control = 0;
        while (control < 10) {
            System.out.println(control);
            control++;
        }
    }

    // Do-While loop example
    public static void exampleDoWhile() {
        int control = 0;
        do {
            System.out.println(control);
            control++;
        } while (control < 10);
    }

    // For loop example
    public static void exampleFor() {
        for (int control = 0; control < 10; control++) {
            System.out.println(control);
        }
    }
}
