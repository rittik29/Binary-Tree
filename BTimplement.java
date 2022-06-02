import java.util.*;
import java.lang.*;

public class BTimplement {

    public static void main(String[] args) {
        node root = createTree();
        System.out.println("Height of Binary Tree....");
        System.out.println(height(root));
        System.out.println("Size  of my Binary Tree....");
        System.out.println(size(root));
        System.out.println("INORDER TRAVERSAL OF BINARY TREE....");
        inorder(root);
        System.out.println();
        System.out.println("POSTORDER TRAVERSAL OF BINARY TREE....");
        postorder(root);
        System.out.println();
        System.out.println("PREORDER TRAVERSAL OF BINARY TREE....");
        preorder(root);
    }

    public static node createTree() {
        node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Data...");
        int data = sc.nextInt();
        if (data == -1)
            return null;
        root = new node(data);
        System.out.println("Enter left Data for..." + data);
        root.left = createTree();
        System.out.println("Enter right Data for..." + data);
        root.right = createTree();

        return root;
    }

    static void inorder(node root) {
        if (root == null)
            return;
        else {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

    }

    static void preorder(node root) {
        if (root == null)
            return;
        else {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

    }

    static void postorder(node root) {
        if (root == null)
            return;
        else {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");

        }

    }

    static int height(node root) {
        if (root == null)
            return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    static int size(node root) {
        if (root == null)
            return 0;

        return size(root.left) + size(root.right) + 1;
    }

}

class node {
    int data;
    node left;
    node right;

    public node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}