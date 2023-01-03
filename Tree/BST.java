package Solving_Problems_using_java.Tree;

public class BST {
    public static void main(String[] args) {
        BinaryTreeImplementation t = new BinaryTreeImplementation();
        BinaryTreeNode root = t.createTree();
        System.out.println(isBst(root));
    }
    private static boolean isBst(BinaryTreeNode root){
        if(root == null){
            return true;
        }

        if(root.left != null && findMax(root.left).data>root.data){
            return false;
        }
        if(root.right!=null && findMin(root.right).data<root.data){
            return false;
        }
        if(!isBst(root.left) || !isBst(root.right)){
            return false;
        }
        return true;
    }
    private static BinaryTreeNode findMax(BinaryTreeNode root){
        if(root == null){
            return null;
        }
        if(root.right == null){
            return root;
        }
        return findMax(root.right);
    }
    private static BinaryTreeNode findMin(BinaryTreeNode root){
        if(root == null){
            return null;
        }
        if(root.left == null){
            return root;
        }
        return findMin(root.left);
    }
}
