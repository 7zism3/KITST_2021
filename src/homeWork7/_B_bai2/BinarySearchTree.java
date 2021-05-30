package homeWork7._B_bai2;


public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    //Chèn thêm node mới
    void insert(int key) {
        root = isnertRec(root, key);
    }

    Node isnertRec(Node root, int key) {
        //Rỗng trả về node new
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = isnertRec(root.left, key);
        else if (key > root.key)
            root.right = isnertRec(root.right, key);
        return root;
    }

    //Duyệt cây
    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    //Tìm kiếm
    Node search(Node root, int key) {
        //TH1 Node =  null, hoặc Node root
        if (root == null || root.key == key)
            return root;
        //TH2 key ở bên trái
        if (root.key > key)
            return search(root.left, key);
        //TH3 key ở bê phải
        return search(root.right, key);
    }

    //Phương thức xóa
    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        //TH1 node root =  null
        if (root == null) return root;

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key)
            root.right = deleteRec(root.right, key);
            //Khi key đúng là key chúng ta cần xóa
        else {
            //Node là node lá hoặc chỉ có 1 node con
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            //Node có 2 node con

//            //Xóa phần tử nhỏ nhất bên phải
//            root.key = minValue(root.right);
//            root.right = deleteRec(root.right, root.key);

            //Xóa phần tử lớn nhất bên trái
            root.key = maxValue(root.left);
            root.left = deleteRec(root.left, root.key);
        }
        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    int maxValue(Node root) {
        int maxv = root.key;
        while (root.right != null) {
            maxv = root.right.key;
            root = root.right;
        }
        return maxv;
    }
}