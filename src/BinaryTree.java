
import java.util.ArrayList;
        import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BinaryTree<T> {
Comparator<T> currentComparator;
    Node root;
    T[] source;
    List<Node> list = new ArrayList<>();


    public BinaryTree(T[]source, Comparator<T> rule){
        this.source=source;
        this.currentComparator=rule;
        Arrays.sort(source,rule);
        root = new Node(null, null, source.length/2, source[source.length/2], null);
    }

    private void buildTree(){
        List<T> tempList=new ArrayList<>();
        for (T temp:source ) {
            tempList.add(temp);
        }

    }
private  BinaryTree<T> getSubTreeLeft(Node root){

        return null;
}
    private  BinaryTree<T> getSubTreeRight(Node root){
        return null;
    }
    public List<Node> find(T element){
        List<Node> result=new ArrayList<>();
        int compare = currentComparator.compare(root.value, element);
        if(compare ==0){
           result.add(root);
       }else if(compare>0){
            getSubTreeLeft(root).find(element);
        }else{
            getSubTreeRight(root).find(element);
        }
        return result;
    }

    public void  add(T element){

    }

    // left to do check right side
    private List<Integer> middleIndex(){
        List<Integer> midIndex = new ArrayList<>();
        for(int i =source.length-1; i>0; i=i/2){
            midIndex.add(i/2);
           // midIndex.add()
        }

        return midIndex;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 4, 9};
//        BinaryTree binaryTree = new BinaryTree(arr);
  //      System.out.println(binaryTree.middleIndex());
    }




    class Node{
        private Node leftSide;
        private Node rightSide;
        int index = 0;
        T value ;
        Node parent;


        public Node(Node leftSide, Node rightSide, int index, T value, Node parent) {
            this.leftSide = leftSide;
            this.rightSide = rightSide;
            this.index = index;
            this.value = value;
            this.parent = parent;
        }



    }



}