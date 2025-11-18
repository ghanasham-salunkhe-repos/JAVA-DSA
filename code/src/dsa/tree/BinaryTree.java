package dsa.tree;

import java.security.PublicKey;
import java.util.List;
import java.util.Objects;

public class BinaryTree {

    private TreeNode<Integer> root;

    public BinaryTree(Integer value) {
        this.root = new TreeNode<>(value);
        this.root.setLeft(null);
        this.root.setRight(null);
    }

    public BinaryTree(){
        this.root=null;
    }

    //    lookup functions
    public TreeNode<Integer> lookUpValue(Integer value){
        return findAndReturnValue(this.root,value);
    }

    private TreeNode<Integer> findAndReturnValue(TreeNode<Integer> treeNode, Integer value ){
        if (treeNode==null){
            return null;// throw error
        } else if (Objects.equals(treeNode.getData(), value)) {
            return treeNode;
        } else if (treeNode.getData()>value) {
            return findAndReturnValue(treeNode.getLeft(),value);
        }
        else {
            return findAndReturnValue(treeNode.getRight(),value);
        }
    }

    public TreeNode<Integer> lookupWithoutRecursion(Integer value){

        if (Objects.equals(this.root.getData(), value)){
            return this.root;
        } else{
            TreeNode<Integer> mynode=this.root;
            while (mynode!=null){
                if (Objects.equals(mynode.getData(), value)){
                    return mynode;
                }
                else if (mynode.getData()>value){
                    mynode=mynode.getLeft();
                }
                else {
                    mynode=mynode.getRight();
                }
            }
            return null;
        }
    }

    // contains function
    public Boolean containsValue(Integer value){
        return findValueExistOrNot(root,value);
    }

    private Boolean findValueExistOrNot(TreeNode<Integer> treeNode, Integer value ){
        if (treeNode==null){
            return false;
        } else if (Objects.equals(treeNode.getData(), value)) {
            return true;
        } else if (treeNode.getData()>value) {
            return findValueExistOrNot(treeNode.getLeft(),value);
        }
        else {
            return findValueExistOrNot(treeNode.getRight(),value);
        }
    }

    public Boolean searchWithoutRecursion(Integer value){

        if (Objects.equals(this.root.getData(), value)){
            return true;
        } else{
            TreeNode<Integer> mynode=this.root;
            while (mynode!=null){
                if (Objects.equals(mynode.getData(), value)){
                    return true;
                }
                else if (mynode.getData()>value){
                    mynode=mynode.getLeft();
                }
                else {
                    mynode=mynode.getRight();
                }
            }
            return false;
        }
    }


    // insert functions

    public void insertNewNode(Integer value){
        this.root=insertRecursively(root, value);
    }

    private TreeNode<Integer> insertRecursively(TreeNode<Integer> node, Integer value) {
        if (node==null){
            return new TreeNode<>(value);
        }
        else if (node.getData()>value){
            node.setLeft(insertRecursively(node.getLeft(),value));
        }
        else {
            node.setRight(insertRecursively(node.getRight(),value));
        }
        return node;
    }


    public void insertNodeWithoutRecursion(Integer value){

        if (this.root==null){
            this.root=new TreeNode<>(value);
        } else{
            TreeNode<Integer> mynode=this.root;
            while (true){
                if (mynode.getData()>value && mynode.getLeft()==null){
                    mynode.setLeft(new TreeNode<>(value));
                    break;
                }
                else if (mynode.getData()<=value && mynode.getRight()==null){
                    mynode.setRight(new TreeNode<>(value));
                    break;
                } else if (mynode.getData()>value) {
                    mynode=mynode.getLeft();
                }
                else {
                    mynode=mynode.getRight();
                }
            }
        }
    }

    // deletion function
    private TreeNode<Integer> getSmallestValue(TreeNode<Integer> node){
        TreeNode<Integer> treeNode=node;
        while (treeNode.getLeft()!=null){
            treeNode=treeNode.getLeft();
        }
        return treeNode;
    }

    public void deleteTreeNode(Integer value){
        this.root=deleteRecurrsively(root,value);
    }

//    deletion algo

//    if node is leaf node -> delete directly point parent to null
//    if node has one child --> child replaces parent, parent points to that new node
//    if node has two child -->
//    find successor -> find smallest value from right subtree
//    make that successor point to it child of nodetobedeleted
//    make parent of nodetobedeleted point to successor

    private TreeNode<Integer> deleteRecurrsively(TreeNode<Integer> treeNode,Integer value){

        // child node
        if (treeNode==null){
            return null;
        }
        else if(treeNode.getData()>value){
            treeNode.setLeft(deleteRecurrsively(treeNode.getLeft(),value));
        }
        else if (treeNode.getData()<value) {
            treeNode.setRight(deleteRecurrsively(treeNode.getRight(),value));
        }
        else {
            // rule if one child is present
            if (treeNode.getLeft()==null){
                return treeNode.getRight();
            }
            if (treeNode.getRight()==null){
                return treeNode.getLeft();
            }

//            rule if both childs are present
            TreeNode<Integer> successorNode=getSmallestValue(treeNode.getRight());
            treeNode.setData(successorNode.getData());
            treeNode.setRight(deleteRecurrsively(treeNode.getRight(),successorNode.getData()));
        }
        return treeNode;
    }

    public TreeNode<Integer> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<Integer> root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }

    // Add to `BinaryTree.java`
    public void printPretty() {
        if (root == null) {
            System.out.println("(empty)");
            return;
        }
        for (String line : buildTreeLines(root)) {
            System.out.println(line);
        }
    }

    // ai generated
    private List<String> buildTreeLines(TreeNode<Integer> node) {
        // Returns a list of strings representing the subtree rooted at node.
        if (node == null) return java.util.Collections.singletonList("");
        String value = String.valueOf(node.getData());

        java.util.List<String> leftLines = buildTreeLines(node.getLeft());
        java.util.List<String> rightLines = buildTreeLines(node.getRight());

        int leftWidth = leftLines.get(0).length();
        int rightWidth = rightLines.get(0).length();

        // Node line
        String nodeLine;
        String leftConnector = "";
        String rightConnector = "";
        if (node.getLeft() != null) {
            leftConnector = "/";
        }
        if (node.getRight() != null) {
            rightConnector = "\\";
        }

        // Compute spacing
        int valueWidth = value.length();
        int leftPad = Math.max(0, leftWidth);
        int rightPad = Math.max(0, rightWidth);

        nodeLine = repeat(" ", leftPad) + value + repeat(" ", rightPad);

        // Connector line
        String connectorLine = "";
        if (node.getLeft() != null || node.getRight() != null) {
            String leftBranch = node.getLeft() != null ? repeat(" ", leftWidth - 1) + leftConnector : repeat(" ", leftWidth);
            String rightBranch = node.getRight() != null ? rightConnector + repeat(" ", rightWidth - 1) : repeat(" ", rightWidth);
            connectorLine = leftBranch + repeat(" ", valueWidth) + rightBranch;
        }

        // Merge child lines
        java.util.List<String> merged = new java.util.ArrayList<>();
        merged.add(nodeLine);
        if (!connectorLine.isEmpty()) merged.add(connectorLine);

        int maxChildHeight = Math.max(leftLines.size(), rightLines.size());
        for (int i = 0; i < maxChildHeight; i++) {
            String leftPart = i < leftLines.size() ? leftLines.get(i) : repeat(" ", leftWidth);
            String rightPart = i < rightLines.size() ? rightLines.get(i) : repeat(" ", rightWidth);
            merged.add(leftPart + repeat(" ", valueWidth) + rightPart);
        }
        return merged;
    }

    private String repeat(String s, int count) {
        if (count <= 0) return "";
        StringBuilder sb = new StringBuilder(count * s.length());
        for (int i = 0; i < count; i++) sb.append(s);
        return sb.toString();
    }
}
