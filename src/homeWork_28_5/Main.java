package homeWork_28_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;



public class Main {
    public static void main(String[] args) throws ParseException {
        TreeMap<NguoiGuiTien, Double> treeNGT = new TreeMap<NguoiGuiTien, Double>();

        String dateString = "07/08/1997";
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = df.parse(dateString);

        NguoiGuiTien ng1 =
                new NguoiGuiTien(1, "Nguyen Van Thuy", "Ninh Bình", "0357897375", date);
        NguoiGuiTien ng2 =
                new NguoiGuiTien(1, "Nguyen Van Quân", "Ninh Bình", "0357892131", date);
        NguoiGuiTien ng3 =
                new NguoiGuiTien(1, "Nguyen Van Khánh", "Ninh Bình", "0867897375", date);
        NguoiGuiTien ng4 =
                new NguoiGuiTien(1, "Nguyen Minh Văn", "Ninh Bình", "0982897375", date);
        NguoiGuiTien ng5 =
                new NguoiGuiTien(1, "Đỗ Văn Hũu", "Ninh Bình", "091497375", date);





    }
}
