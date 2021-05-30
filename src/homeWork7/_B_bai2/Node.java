package homeWork7._B_bai2;

//Tạo class Node với khóa key và 2 nút left, right
public class Node {
    int key;
    Node left, right;

    //Tọa hàn tạo với k có nhánh nào
    public Node (int item){
        key = item;
        left = right = null;
    }
}
