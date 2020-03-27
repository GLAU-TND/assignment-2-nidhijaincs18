/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    static Queue<TreeNode> q;
    //constructor

    //method to insert a element in tree
    public TreeNode insert(TreeNode root, int x) {
        if (root == null)
            return new TreeNode(x);
        else if (x > root.getData()) // x is greater. Should be inserted to right
            root.setRight(insert(root.getRight(), x));
        else // x is smaller should be inserted to left
            root.setLeft(insert(root.getLeft(), x));
        return root;
    }
    // A utility function to do inorder traversal of BST
    public void inorderRec(TreeNode root) {
        if (root.getLeft() != null) {
            inorderRec(root.getLeft());
            System.out.println(root.getData());
            inorderRec(root.getRight());
        }
    }

}
