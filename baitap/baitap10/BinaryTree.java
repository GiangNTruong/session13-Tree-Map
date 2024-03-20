package baitap.baitap10;

public class BinaryTree {
    Node root;
    boolean search (Node root , int key){
        //Đặt current trỏ tới root
        Node current = root;

        //Lặp các bước sau đến khi current là null or phan tử khơp voi current.element
        while (current != null) {
            if (key<current.key){
                //Nếu element nhỏ hơn current element, gán san trái
                current = current.left;
            }else if (key>current.key){
                //Nếu element nhỏ hơn current element, gán san phải
                current = current.right;
            }else {
                return true;
            }
        }
        //Nếu current là null ,cay con trống và element ko tìm tháy cây
        return false;
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
        System.out.println("Phần tử 10 có tồn tại trong cây " + tree.search(tree.root,10));
        System.out.println("Phần tử 99 có tồn tại trong cây " + tree.search(tree.root,99));

    }
}
