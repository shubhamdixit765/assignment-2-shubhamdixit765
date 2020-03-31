/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree

import problem1.node.TreeNode;

public class MyBinarySearchTree {

    public static StringBuilder preOrderString;
    public TreeNode root;
    private int count = 0;

    public MyBinarySearchTree() {
        this.root = null;
        preOrderString = new StringBuilder();
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        preOrder(root.getLeft());
        preOrder(root.getRight());
        preOrderString.append(root.getKey()).append(" ");
    }

    public void add(final int value) {
        this.root = addService(this.root, value);
    }

    public TreeNode addService(final TreeNode treeRoot, final int addingValue) {
        if (treeRoot == null) {
            return new TreeNode(addingValue);
        }
        if (addingValue < treeRoot.getKey()) {
            treeRoot.setLeft(addService(treeRoot.getLeft(), addingValue));
        } else if (addingValue == treeRoot.getKey()) {
            return treeRoot;
        } else {
            treeRoot.setRight(addService(treeRoot.getRight(), addingValue));
        }

        return treeRoot;
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getKey() + " ");
    }

    private void LeftNode(TreeNode root) {
        if (root == null) return;
        else {

            if (root.getLeft() != null)
                System.out.println(root.getLeft().getKey());
            else
                count++;
            LeftNode(root.getLeft());
            LeftNode(root.getRight());
        }
    }

    public void printLeftNode() {
        LeftNode(root);
    }

    public void countNotLeft() {
        System.out.println(count);
    }


}
