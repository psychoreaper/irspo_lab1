public class Node {
    /**
     * tree units: left child, right child
     */
    public Node left, right;

    /**
     * value of the node
     */
    public Fraction value;

    /**
     * constructor
     * 
     * @param value
     */
    public Node(Fraction value) {
        this.value = value;
    }
}