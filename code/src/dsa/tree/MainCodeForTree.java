package dsa.tree;

public class MainCodeForTree {

    static void main() {

        BinaryTree binaryTree=new BinaryTree(100);
        binaryTree.insertNodeWithoutRecursion(50);
        binaryTree.insertNodeWithoutRecursion(150);
        binaryTree.insertNodeWithoutRecursion(110);
        binaryTree.insertNodeWithoutRecursion(25);
        binaryTree.insertNodeWithoutRecursion(75);
        binaryTree.insertNodeWithoutRecursion(300);
        binaryTree.insertNodeWithoutRecursion(150);
        binaryTree.insertNodeWithoutRecursion(120);
        binaryTree.insertNodeWithoutRecursion(105);
        binaryTree.insertNodeWithoutRecursion(25);
        binaryTree.insertNodeWithoutRecursion(75);
        binaryTree.insertNodeWithoutRecursion(300);
        binaryTree.insertNodeWithoutRecursion(15);
        binaryTree.printPretty();

        binaryTree=new BinaryTree(100);
        binaryTree.insertNewNode(50);
        binaryTree.insertNewNode(150);
        binaryTree.insertNewNode(110);
        binaryTree.insertNewNode(25);
        binaryTree.insertNewNode(75);
        binaryTree.insertNewNode(300);
        binaryTree.insertNewNode(150);
        binaryTree.insertNewNode(120);
        binaryTree.insertNewNode(105);
        binaryTree.insertNewNode(25);
        binaryTree.insertNewNode(75);
        binaryTree.insertNewNode(300);
        binaryTree.insertNewNode(15);
        binaryTree.printPretty();

        System.out.println(binaryTree.searchWithoutRecursion(301));
        System.out.println(binaryTree.searchWithoutRecursion(75));
        System.out.println(binaryTree.searchWithoutRecursion(25));
        System.out.println(binaryTree.searchWithoutRecursion(251));
        binaryTree.insertNewNode(251);
        binaryTree.printPretty();
        System.out.println(binaryTree.searchWithoutRecursion(251));

        TreeNode<Integer> node = binaryTree.lookupWithoutRecursion(251);
        TreeNode<Integer> node1=binaryTree.lookUpValue(251);
        System.out.println(node);
        System.out.println(node1);
    }
}
