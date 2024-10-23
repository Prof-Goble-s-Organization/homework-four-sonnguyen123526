package hw04;

/**
 * Find the key associated with the minimum value in a tree.
 */
public class MinKeyFinder implements CS232Visitor<String, Integer> {


	private String minKey;
	private int minVal;


	public MinKeyFinder() {
		this.minKey = null;
		this.minVal = Integer.MAX_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	public void visit(String key, Integer value) {
		if (value < minVal){
			minKey = key;
			minVal = value;
		}

	}

	/**
	 * Get the key associated with the minimum value in the tree.
	 * 
	 * @return the key associated with the minimum value.
	 */
	public String getMinKey() {
		return minKey;
	}
	
	public static void main(String[] args) {
		CS232LinkedBinaryTree<String, Integer> tree = new CS232LinkedBinaryTree<>("9", 9);
		tree.add("Node1", 10);
		tree.add("Node2", 11);
		tree.add("Node3", 12);
		tree.add("Node4", 13);
		tree.add("Node5", 14);
		tree.add("Node6", 15);
		tree.add("Node7", 16);
		tree.add("Node8", 17);
		tree.add("Node9", 18);
			
		MinKeyFinder minKeyFinder = new MinKeyFinder();
		tree.visitPreOrder(minKeyFinder);
		System.out.println("The value of the minimum value is " + minKeyFinder.getMinKey());
	}
}
