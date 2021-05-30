package homeWork_28_5;

import java.util.Date;

public class NguoiGuiTien implements Comparable<NguoiGuiTien> {
    int ma;
    String hoTen;
    String diaChi;
    String sdt;
    Date ngaySinh;

    public NguoiGuiTien() {
    }

    public NguoiGuiTien(int ma, String hoTen, String diaChi, String sdt, Date ngaySinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public int compareTo(NguoiGuiTien n) {
        int comp = 0;
        if (ma < n.getMa() ) {
            comp = -1;
        } else if (ma > n.getMa()) {
            comp = 1;
        }
        return comp;
    }



}
