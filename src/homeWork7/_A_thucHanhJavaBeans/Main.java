package homeWork7._A_thucHanhJavaBeans;

public class Main {
    public static void main(String[] args) throws Exception {
        StudenBean bean = new StudenBean();
        bean.ngheDeGui(new BeanLAngNghe());
        bean.setTen("Thủy");//Tự động gọi method propertyChange
        bean.setTuoi(23);
        bean.setTen("Tuấn Anh");
        bean.setTuoi(24);
    }
}
