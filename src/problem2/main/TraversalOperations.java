
package problem2.main;

import problem1.node.TreeNode;

public class TraversalOperations {

    void printPostorder(TreeNode node) {
        if (node == null)
            return;
        printPostorder(node.getLeft());
        printPostorder(node.getRight());
        System.out.print(node.getData() + " ");
    }
    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(TreeNode node) {
        if (node == null)
            return;
        printInorder(node.getLeft());
        System.out.print(node.getData() + " ");
        printInorder(node.getRight());
    }
    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.getData() + " ");
        printPreorder(node.getLeft());
        printPreorder(node.getRight());
    }


}
