package baitap.baitap8;

public class BinaryTree {
    Node root;
    void printPostorder (){
        printPostorder(root);
    }
    void printPostorder (Node node){
        if (node == null){
            return;
        }
        System.out.print(node.key + " ");//In giá tr của nuút
        printPostorder(node.left1);//Duyệt cây con bên trái
        printPostorder(node.right1);//Duyệt cây con bên phải

    }

    public static void main(String[] args) {
        BinaryTree tree= new BinaryTree();
        tree.root = new Node(27);
        tree.root.left1 = new Node(14);
        tree.root.left1.left1 = new Node(10);
        tree.root.left1.right1 = new Node(19);
        tree.root.right1 = new Node(35);
        tree.root.right1.right1 = new Node(42);
        tree.root.right1.left1 = new Node(31);
        System.out.println("Duyệt theo thứ tự preorder : ");
        tree.printPostorder();
    }

}
