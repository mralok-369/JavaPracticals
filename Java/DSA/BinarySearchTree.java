package com.company.DSA;

public class BinarySearchTree {
    private TreeNode root;
    // structure of BST
    public class TreeNode {
        private int data; // generic type
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }
    // insertion in BST (recursive method)
    public void insert(int value){
        root = insert(root,value);
    }
    public TreeNode insert(TreeNode root, int value){
        if (root == null){
            root = new TreeNode(value);
            return root;
        }
        if (value<root.data){
            root.left = insert(root.left,value);
        } else {
            root.right = insert(root.right,value);
        }
        return root;
    }
    // display the BST in inOrder
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    // search a given key in a BST (Recursive approach)
    public TreeNode searchKey(TreeNode root, int key){
        if (root == null || root.data == key){
            return root;
        }
        if (key< root.data){
            return searchKey(root.left, key);
        } else {
            return searchKey(root.right, key);
        }
    }

    // main function
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);
        bst.inOrder(); // display BST in inOrder
        // searching a given key from BST
        if (null!= bst.searchKey(bst.root,3)){
            System.out.println("\nKey found...!!!");
        } else {
            System.out.println("\nKey not found...!!!");
        }
    }
}
