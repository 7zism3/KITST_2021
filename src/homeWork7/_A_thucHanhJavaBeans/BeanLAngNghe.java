package homeWork7._A_thucHanhJavaBeans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BeanLAngNghe implements PropertyChangeListener {
    // This method is called every time the property value is changed
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Sinh viên có = " + evt.getPropertyName());
        System.out.println("Giá trị cũ = " + evt.getOldValue());
        System.out.println("Giá trị mới = " + evt.getNewValue());
        System.out.println("--");
    }
}

