package week5.wednesday.binarytree;

import week5.wednesday.binarytree.BinaryTree.Node;

public class NodeCalculator {
	private NodeChecker nodeChecker;

	public NodeCalculator() {
		nodeChecker = new NodeChecker();
	}

	public void calculateHeight(Node node) {
		if (node == null) {
			return;
		}
		if (hasTwoChilds(node)) {
			int leftHeight = node.left.height;
			int rightHight = node.right.height;
			if (leftHeight == rightHight) {
				return;
			}
			int max = Math.max(leftHeight, rightHight);
			node.height = max + 1;
		} else if (nodeChecker.hasLeftNode(node)
				&& !nodeChecker.hasRightNode(node)) {
			node.height = node.left.height + 1;
		} else if (!nodeChecker.hasLeftNode(node)
				&& nodeChecker.hasRightNode(node)) {
			node.height = node.right.height + 1;
		}
		calculateHeight(node.parent);
	}

	public void recalculateHeight(Node node) {
		if (node == null) {
			return;
		}
		if (hasTwoChilds(node)) {
			int max = Math.max(node.left.height, node.right.height);
			node.height = max + 1;
		} else if (nodeChecker.hasLeftNode(node)
				&& !nodeChecker.hasRightNode(node)) {
			node.height = node.left.height + 1;
		} else if (!nodeChecker.hasLeftNode(node)
				&& nodeChecker.hasRightNode(node)) {
			node.height = node.right.height + 1;
		}
		recalculateHeight(node.parent);
	}

	public void recalculateDepth(Node node) {
		if (node == null) {
			return;
		}
		recalculateDepth(node.right);
		node.depth--;
		recalculateDepth(node.left);
	}

	private boolean hasTwoChilds(Node node) {
		return nodeChecker.hasLeftNode(node) && nodeChecker.hasRightNode(node);
	}
}
