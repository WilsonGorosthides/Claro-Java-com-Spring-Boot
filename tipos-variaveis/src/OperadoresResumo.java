public class OperadoresResumo {

    public static void main(String[] args) {

        // Operadores Aritméticos
        int a = 10, b = 3;
        System.out.println("Aritméticos:");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo (resto): " + (a % b));
        System.out.println();

        // Operadores de Atribuição
        int x = 5;
        System.out.println("Atribuição:");
        x += 3;
        System.out.println("x += 3 => " + x);
        x *= 2;
        System.out.println("x *= 2 => " + x);
        System.out.println();

        // Operadores Relacionais
        int idade = 18;
        System.out.println("Relacionais:");
        System.out.println("Maior que 18: " + (idade > 18));
        System.out.println("Maior ou igual a 18: " + (idade >= 18));
        System.out.println("Igual a 18: " + (idade == 18));
        System.out.println("Diferente de 18: " + (idade != 18));
        System.out.println();

        // Operadores Lógicos
        boolean cond1 = true, cond2 = false;
        System.out.println("Lógicos:");
        System.out.println("AND (&&): " + (cond1 && cond2));
        System.out.println("OR (||): " + (cond1 || cond2));
        System.out.println("NOT (!): " + (!cond1));
        System.out.println();

        // Operadores Unários: Incremento e Decremento
        int num = 5;
        System.out.println("Unários - Incremento e Decremento:");
        System.out.println("Valor inicial: " + num);

        System.out.println("Pré-incremento (++num): " + (++num)); // incrementa antes de usar
        System.out.println("Pós-incremento (num++): " + (num++)); // usa e depois incrementa
        System.out.println("Após pós-incremento: " + num);

        System.out.println("Pré-decremento (--num): " + (--num)); // decrementa antes
        System.out.println("Pós-decremento (num--): " + (num--)); // usa e depois decrementa
        System.out.println("Após pós-decremento: " + num);
        System.out.println();

        // Operador Ternário
        System.out.println("Ternário:");
        int nota = 7;
        String resultado = (nota >= 6) ? "Aprovado" : "Reprovado";
        System.out.println("Resultado: " + resultado);
    }
}
