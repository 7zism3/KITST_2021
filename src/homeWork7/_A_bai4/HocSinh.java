package homeWork7._A_bai4;

import java.io.Serializable;
import java.util.Date;

public class HocSinh implements Serializable {
    String hoTen;
    Date ngaySinh;
    String diaChi;

    public HocSinh(String hoTen, Date ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
}
