package homeWork7._B_bai2;

public class thucHanhCayNhiPhan {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        //Chèn lần lượt vào key

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Cây ban đầu: ");
        tree.inorder();

        System.out.println("Xóa 30: ");
        tree.deleteKey(30);
        tree.inorder();

        System.out.println("chèn 22, 24, 25, 23: ");
        tree.insert(22);
        tree.insert(24);
        tree.insert(25);
        tree.insert(23);
        tree.inorder();


    }
}
