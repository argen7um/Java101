package week5.wednesday.binarytree;

import week5.wednesday.binarytree.BinaryTree.Node;

public class TreePrinter {
	BinaryTree.Node root;

	public TreePrinter(BinaryTree.Node root) {
		this.root = root;
	}

	private String recursivePrint(Node node) {
		if (node == null) {
			return "";
		}
		return recursivePrint(node.left) + " " + node.data + ","
				+ recursivePrint(node.right);
	}

	private String recursivePrintNodeData(Node node) {
		if (node == null) {
			return "";
		}
		return recursivePrintNodeData(node.left) + " " + node.data + "( H:"
				+ node.height + " D:" + node.depth + ")" + ","
				+ recursivePrintNodeData(node.right);
	}

	public String recursivePrintNodeData() {
		if (root == null) {
			return "[]";
		}
		String bst = "[" + recursivePrintNodeData(root).trim();
		return bst.substring(0, bst.length() - 1) + "]";
	}

	@Override
	public String toString() {
		if (root == null) {
			return "[]";
		}
		String bst = "[" + recursivePrint(root).trim();
		return bst.substring(0, bst.length() - 1) + "]";
	}
}
