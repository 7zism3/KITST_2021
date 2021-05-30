package homeWork7._A_thucHanhJavaBeans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class StudenBean {
    private PropertyChangeSupport nhanVaXuLy = new PropertyChangeSupport(this);
    private String ten;
    private int tuoi;

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        nhanVaXuLy.firePropertyChange("Tên ", this.ten, ten);
        this.ten = ten;
    }

    public int getTuoi() {
        return this.tuoi;
    }

    public void setTuoi(int tuoi) {
        nhanVaXuLy.firePropertyChange("Tuổi", this.tuoi, tuoi);
        this.tuoi = tuoi;
    }

    public void ngheDeGui(PropertyChangeListener listener) {
        nhanVaXuLy.addPropertyChangeListener(listener);
    }

    public StudenBean() {
    }

}


