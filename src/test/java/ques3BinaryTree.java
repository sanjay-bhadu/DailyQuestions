import java.util.LinkedList;
import java.util.Queue;

public class ques3BinaryTree {
    //defining a Node
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    //In Binary Tree the left node has lower value than parent node.
    //Right node has higher value than parent node.
    static public Node addingNode(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        else{
            if(data > root.data)
            {
                root.right=addingNode(root.right,data);
            }
            else if(root.data>data){
                root.left=addingNode(root.left,data);
            }
            else{
                return root;
            }
            return root;
        }
    }
    //finding element in a Binary tree.
    public static boolean presentNode(Node root,int value)
    {
        if(root==null)
            return false;
        else{
            if(root.data==value)
                return true;
            else if(value<root.data && root.left!=null)
                return presentNode(root.left,value);
            else if(value> root.data && root.right!=null)
                return presentNode(root.right,value);
            else
                return false;
        }
    }

    //deleting a node
    public static Node deletingNode(Node root,int value)
    {
        //first case node is empty
        if(root==null)
        {
            return null;
        }
        // second case if value to be delete is equal to root node value
        if(root.data==value)
        {
            //if found node has no child node(leaf node)
            if(root.left==null && root.right==null)
            {
                return null;
            }
            else{
                if(root.left==null)
                    return root.right;
                else if (root.right==null) {
                    return root.left;
                }
                else{
                    //for this first we will find the minimum value in right child of the node.
                    int temp=minimumValue(root.right);
                    root=deletingNode(root.right,temp);
                    return root;
                }
            }
        }

        //third case .. if value to be delete is greater than root value
        if(root.data<value) {
            root.right = deletingNode(root.right, value);
            return root;
        }

        //final case .. when value to be deleted is less than root value
        root.left=deletingNode(root.left,value);
        return root;
    }

    //finding minimum value
    static public int minimumValue(Node root)
    {
        int min=root.data;
        while(root.left!=null)
        {
            min=root.left.data;
            root=root.left;
        }
        return min;
    }
    //in-order transversal
    //left->root->right;
    public static void inOrder(Node root){
        if(root!=null)
        {
           inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    //preorder transversal
    //root->left->right
    public static void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //post order transversal
    //left->right->root;
    public static void postOrder(Node root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    //levelOrder
    //transversing eachlevel
    public static void levelOrder(Node root)
    {
        if(root==null)
            return;
        else{
            Queue<Node> nodes=new LinkedList<>();
            nodes.add(root);
            while(!nodes.isEmpty())
            {
                Node temp=nodes.remove();
                System.out.print(temp.data+" ");
                if(temp.left!=null)
                    nodes.add(temp.left);
                if(temp.right!=null)
                    nodes.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root=new Node(5);
        root=addingNode(root,4);
        root=addingNode(root,7);
        root=addingNode(root,3);
        root=addingNode(root,1);
        root=addingNode(root,9);
        root=addingNode(root,12);
        root=addingNode(root,14);
        preOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        System.out.println(presentNode(root,6));
        root=deletingNode(root,1);
        preOrder(root);
        System.out.println();
        levelOrder(root);
    }




}
