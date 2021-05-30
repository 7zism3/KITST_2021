package basicOOP;
public class Sphere extends SuperCircle {
   protected String name;  
   // kề thừa radius
    // Muốn khởi tạo đối tượng của Sphere (của lớp con) thì đối tượng của lớp cha
    // phải được khởi tạo trước  
   public Sphere(int rd) {  
   // tự động gọi constructor mặc định (ko tham số) của lớp nếu như ko có lệnh gọi constructor    
      super(100);
       name="Sphere";      
       
    }   
}


   
//   public static void main(String[] agrs) {        
//        Sphere sSp = new Sphere(5);
//    }
//    
//}
//
//
//   
//   
//    // Ham tinh dien tich bet mat. Ghi de ham getArea()
//    public double getArea() {
//        return 4 * Math.PI * radius * radius;
//    }
//    // su dung radius cua lop SuperCircle
//    // Ham tinh the tich
//    public double getVolume() {
//        double t = R();
//        System.out.println(t);
//        return (4.0d / 3) * Math.PI * radius * radius * radius;
//
//    }