import java.util.Stack;

public class FractionSet {

    /**
     * root for binary search tree number of nodes in that tree
     */
    public static Node root;
    public int size;

    /** constructor */
    public FractionSet() {
        root = null;
        size = 0;
    }

    /**
     * adding the fraction to a set
     * 
     * @param node
     * @param value
     */
    public void insert(Node node, Fraction value) {
        Node n = new Node(value);
        if (root == null) {
            root = n; // this node is the root, the maximum and the minimum as it's the first and the
                      // only one node in the tree
            /* minCache.push(value.value()); */
            // maxCache.push(value.value());
        } else {
            if (value.value() < node.value.value()) {
                if (node.left != null) {
                    insert(node.left, value);
                } else {
                    node.left = new Node(value);
                }
            } else if (node.right != null) {
                insert(node.right, value);
            } else {
                node.right = new Node(value);
            }
        }
        this.size++;
    }

    public Stack<Double> maxCache;

    /**
     * Searches for minimum node of a tree
     * 
     * @param x
     * @return
     */
    private Node minNode(Node x) {
        if (x.left == null) {
            return x;
        } else
            return minNode(x.left);
    }

    /**
     * starts a search
     * 
     * @param x - start point
     * @return minimum node
     */
    public Fraction minimum(Node x) { // returns the value from the recursive method
        return minNode(x).value;
    }

    /**
     * Searches for maximum node of a tree
     * 
     * @param x
     * @return
     */
    private Node maxNode(Node x) { // same but searches for the most right node
        if (x.right == null) {
            return x;
        } else
            return maxNode(x.right);
    }

    /**
     * starts a search
     * 
     * @param x - start point
     * @return maximum node
     */
    public Fraction maximum(Node x) {
        return maxNode(x).value;
    }

    private int more__; // used as maximum value of sum counted recursively in "more" function

    /**
     * shows how many elements are bigger than x
     * 
     * @param x
     */
    public void more(double x) {
        more__ = 0;
        System.out.println("more than x=" + x + ": " + moreTraversal(root, x));
    }

    /**
     * modificated pre-order Traversal
     * 
     * @param root
     * @param x
     * @return
     */
    private int moreTraversal(Node root, double x) {
        int sum = 0;
        if (root != null) {
            if (root.value.value() > x) {
                sum++;
            }
            moreTraversal(root.left, x);
            moreTraversal(root.right, x);
        }
        more__ += sum;
        return more__;
    }

    private int less__; // used as maximum value of sum counted recursively in "less" function

    /**
     * shows how many elements are smaller than x
     * 
     * @param x
     */
    public void less(double x) {
        less__ = 0;
        System.out.println("less than x=" + x + ": " + lessTraversal(root, x));
    }

    /**
     * modificated post-order Traversal
     * 
     * @param root
     * @param x
     * @return
     */
    private int lessTraversal(Node root, double x) {
        int sum = 0;
        if (root != null) {
            if (root.value.value() < x) {
                sum++;
            }
            lessTraversal(root.left, x);
            lessTraversal(root.right, x);
        }
        less__ += sum;
        return less__;
    }
}