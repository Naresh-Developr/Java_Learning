package DSA.BinaryTrees;
class BinarySearchTree {

    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;


        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }



        private Node root;

        // public BST(){

        // }

        public int height(Node node){
            if(node==null){
                return -1;}

            return node.height;
        }

        public boolean isEmpty(){
            return root==null;  // retrun if root is empty
        }

        public void display(){
            display(root,"Root Node: ");
        }

        private void display(Node node,String details){

            if(node==null){
                return;

            }
            System.out.println(details+ node.getValue());

            display(node.left,"Left of "+ node.getValue()+" : ");
            display(node.right,"Right of "+ node.getValue()+" : ");

        }

        public void insert(int value){

            root = insert(value, root);

        }

        private Node insert(int value,Node node){
            if(node==null){
                Node newNode = new Node(value);
                return newNode;
            }

            if(value<node.value){
                node.left = insert(value, node.left);
            }
            if(value>node.value){
                node.right = insert(value, node.right);
            }

            node.height = Math.max(height(node.left),height(node.right));
            return node;
        }

        public boolean balanced(){
            return balanced(root);
        }

        private boolean balanced(Node node){
            if(node==null){
                return false;
            }

            return Math.abs(height(node.left)-height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);

        }

        public void populate(int[] nums){

            for(int i=0;i<nums.length;i++){
                this.insert(nums[i]);
            }
        }

        public static void main(String[] args) {
            BinarySearchTree bst = new BinarySearchTree();
            int[] nums = {1,2,3,4,5,6,7,8,11,9};
    
            bst.populate(nums);
            bst.display();
    
        }



    




}
