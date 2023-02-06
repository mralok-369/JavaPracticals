package com.company.DSA;
import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;
    public class TreeNode {
        private int data; // generic type
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }
    // creating a binary tree
    public void createBinaryTree(){
        TreeNode first = new TreeNode(10);
        TreeNode second = new TreeNode(20);
        TreeNode third = new TreeNode(30);
        TreeNode fourth = new TreeNode(40);
        TreeNode fifth = new TreeNode(50);
        root = first;
        root.left = second;
        root.right = third;
        second.left = fourth;
        second.right = fifth;
    }
    // Recursive preorder Binary Tree traversal
    public void preOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    // iterative preorder traversal of BT
    public void itrPreOrder(TreeNode root){
        if (root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");
            if (temp.right != null){
                stack.push(temp.right);
            }
            if (temp.left != null){
                stack.push(temp.left);
            }
        }
    }
    // Recursive inOrder traversal of BT
    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    // iterative inOrder traversal of BT
    public void itrInOrder(TreeNode root){
        if (root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null){
            if (temp != null){
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
        }
    }
    // Recursive postOrder traversal of BT
    public void postOrder(TreeNode root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    // iterative inOrder traversal of BT
    public void itrPostOrder(TreeNode root){
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (current!=null || !stack.isEmpty()){
            if (current!=null){
                stack.push(current);
                current=current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null){
                    temp = stack.pop();
                    System.out.print(temp.data+" ");
                    while (!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data+" ");
                    }
                } else {
                    current = temp;
                }
            }
        }
    }
    // level order traversal of a BT
    public void levelOrder(TreeNode root){
        if (root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data+" ");
            if (temp.left != null){
                queue.offer(temp.left);
            }
            if (temp.right != null){
                queue.offer(temp.right);
            }
        }
    }
    // maximum element of a BT
    public int findMax(TreeNode root){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if (left>result){
            result = left;
        }
        if (right > result){
            result = right;
        }
        return result;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree(); // creating a binary tree
        // Traversal of tree
        /*
        System.out.println("Recursive preorder traversal : ");
        bt.preOrder(bt.root);  // recursive preorder traversal
        System.out.println("\nIterative preorder traversal : ");
        bt.itrPreOrder(bt.root); // iterative preorder traversal
        System.out.println("\nRecursive inorder traversal : ");
        bt.inOrder(bt.root); // recursive inorder traversal
        System.out.println("\nIterative inorder traversal : ");
        bt.itrInOrder(bt.root); // Iterative inorder traversal
        System.out.println("\nRecursive PostOrder traversal : ");
        bt.postOrder(bt.root); // recursive PostOrder traversal
        System.out.println("\nIterative PostOrder traversal : ");
        bt.itrPostOrder(bt.root); // Iterative PostOrder traversal
         */
        System.out.println("\nLevel Order traversal : ");
        bt.levelOrder(bt.root); // Level Order traversal
        System.out.println("\nmaximum element of the BT : "+bt.findMax(bt.root)); // max element of BT
    }
}
