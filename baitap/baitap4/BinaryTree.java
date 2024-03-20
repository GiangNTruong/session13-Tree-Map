package baitap.baitap4;

public class BinaryTree {
    Node root;

    void printPostorder (Node node){
        if (node == null){
            return;
        }
        //DUyệt các cây con bên trái = đệ quy
        printPostorder(node.left);
        //DUyệt các cây con bên phải = đệ quy
        printPostorder((node.right));
        System.out.println(node.key + " ");
    }
    void printPostorder(){
        printPostorder(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(27);
        tree.root.left = new Node(14);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(19);
        tree.root.right = new Node(35);
        tree.root.right.right = new Node(42);
        tree.root.right.left = new Node(31);
        System.out.println("Duyệt theo thứ tự postorder của cây nhị phân là: ");
        tree.printPostorder();
    }
}
