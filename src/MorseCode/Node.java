package MorseCode;

public class Node {
	 public char character;
	    public Node left, right;
        
	    
	    
	    public Node(char character) {
	        this.character = character;
	        left = right = null;
	    }

	    public Node() {
		}

		public void setCharacter(char character) {
	        this.character = character;
	    }
}
