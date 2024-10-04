package MorseCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree morseTree = new BinaryTree();
        morseTree.displayTree(); 

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Escolha uma opção (1 - Decodificar, 2 - Sair): ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            if (option == 1) {
                System.out.print("Digite o código Morse para decodificar: ");
                String morseCode = scanner.nextLine();
                String decodedMessage = morseTree.decode(morseCode);
                System.out.println("Mensagem decodificada: " + decodedMessage);
            } else if (option == 2) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

       
        scanner.close();
    }
}
