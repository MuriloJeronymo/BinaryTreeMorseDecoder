package MorseCode;

import java.awt.Graphics;

import javax.swing.JPanel;

public class TreePanel extends JPanel {
    Node root;
    int xOffset = 400;
    int yOffset = 50;
    int xGap = 128;

    public TreePanel(Node root) {
        this.root = root;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawNode(g, root, xOffset, yOffset, xGap);
    }

    private void drawNode(Graphics g, Node node, int x, int y, int xGap) {
        if (node != null) {
            g.drawString(String.valueOf(node.character), x, y);

            if (node.left != null) {
                int childX = x - xGap;
                int childY = y + 50;
                g.drawLine(x, y + 5, childX, childY - 10);
                drawNode(g, node.left, childX, childY, xGap / 2);
            }

            if (node.right != null) {
                int childX = x + xGap;
                int childY = y + 50;
                g.drawLine(x, y + 5, childX, childY - 10);
                drawNode(g, node.right, childX, childY, xGap / 2);
            }
        }
    }
}
