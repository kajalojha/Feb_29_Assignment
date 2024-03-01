package Feb_29_Assignment;

class Treeenode
{
    int value;// value of node
    Treeenode left , right;// left and right with reference of class treenode
    Treeenode(int value)// parameterized constructor
    {
        this.value = value;
    }
}
class Root_Leaf_Sum// class to find the sum of root to leaff
{
    public int sumNumber(Treeenode root ) // method sum number and pass treenode typ root
    {
        return NodesSum(root,0) % 1003;// call  the method nodessum and take modulo 1003
    }
    public int NodesSum(Treeenode node , int currentsum)// method nodessum and pass node and current sum
    {
        if(node == null)// if node = null
        {
            return 0;// return 0
        }
        int newSum = (currentsum*10+ node.value) % 1003;
        // update the current sum and take modulo 1003
        if(node.left == null && node.right== null)// means nodes of tree is end
        {
            return newSum;// return new sum
        }
        // recursively calculate the sum of root to leaf number for left and right subtree
      int leftsum =  NodesSum(node.left, newSum);// call the function for node left
        int rightsum = NodesSum(node.right , newSum);// call the function for right node
        return (leftsum+rightsum) % 1003;// return sum of left and right
    }

}
public class Q2_sum_of_leafNodes
{
    public static void main(String[] args)
    {
     Treeenode root = new Treeenode(1);// object created and value is pass
     root.left = new Treeenode(2);
     root.right = new Treeenode(3);
//     root.left.left = new Treeenode(4);
//     root.left.right = new Treeenode(5);
    Root_Leaf_Sum sum = new Root_Leaf_Sum();
    int result = sum.sumNumber(root);
        System.out.println("sum of root to leaf number :" + result);

    }
}
