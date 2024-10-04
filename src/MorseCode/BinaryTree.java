package MorseCode;

import javax.swing.*;
import java.awt.*;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        buildMorseTree();
    }

    private void buildMorseTree() {
        root = new Node(' ');

        root.left = new Node('E');
        root.right = new Node('T');

        root.left.left = new Node('I');
        root.left.right = new Node('A');
        root.right.left = new Node('N');
        root.right.right = new Node('M');

        root.left.left.left = new Node('S');
        root.left.left.right = new Node('U');
        root.left.right.left = new Node('R');
        root.left.right.right = new Node('W');
        root.right.left.left = new Node('D');
        root.right.left.right = new Node('K');
        root.right.right.left = new Node('G');
        root.right.right.right = new Node('O');

        root.left.left.left.left = new Node('H');
        root.left.left.left.right = new Node('V');
        root.left.left.right.left = new Node('F');
        root.left.right.left.left = new Node('L');
        root.left.right.right.left = new Node('P');
        root.left.right.right.right = new Node('J');
        root.right.left.left.left = new Node('B');
        root.right.left.left.right = new Node('X');
        root.right.left.right.left = new Node('C');
        root.right.left.right.right = new Node('Y');
        root.right.right.left.left = new Node('Z');
        root.right.right.left.right = new Node('Q');
        root.left.left.right.right = new Node (' ');
        root.right.right.right.left = new Node(' ');
        root.right.right.right.right = new Node(' ');

        root.left.left.left.left.left = new Node('5');
        root.left.left.left.left.right = new Node('4');
        root.left.left.left.right.right = new Node('3');
        root.left.left.right.right.right = new Node('2');
        root.left.right.right.right.right = new Node('1');
        root.right.left.left.left.left = new Node('6');
        root.right.right.left.left.left = new Node('7');
        root.right.right.right.left.left = new Node('8');
        root.right.right.right.right.left = new Node('9');
        root.right.right.right.right.right = new Node('0');



        

        

    }

    public void displayTree() {
        JFrame frame = new JFrame("Árvore Binária");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new TreePanel(root));
        frame.setVisible(true);
    }

    public char decodeLetter(String morseCode) {
        Node currentNode = root;
        for (char symbol : morseCode.toCharArray()) {
            if (symbol == '.') {
                currentNode = currentNode.left;
            } else if (symbol == '-') {
                currentNode = currentNode.right;
            }
        }
        char decodedChar = currentNode.character;
        System.out.println("Morse: " + morseCode + " -> Letra: " + decodedChar);
        return decodedChar;
    }

    public String decode(String morsePhrase) {
        StringBuilder decodedMessage = new StringBuilder();
        String[] words = morsePhrase.split("/");

        for (String word : words) {
            String[] letters = word.trim().split(" ");
            for (String letter : letters) {
                decodedMessage.append(decodeLetter(letter));
            }
            decodedMessage.append(" ");
        }
        return decodedMessage.toString().trim();
    }

    
}
