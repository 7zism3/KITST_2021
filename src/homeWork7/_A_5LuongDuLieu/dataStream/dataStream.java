package _A_5LuongDuLieu.dataStream;




        import java.io.BufferedInputStream;
        import java.io.BufferedOutputStream;
        import java.io.DataInputStream;
        import java.io.DataOutputStream;
        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.util.Scanner;
        import java.util.logging.Level;
        import java.util.logging.Logger;

public class dataStream {

    static   String dataFile = "Invoices.dat";
    static final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    static final int[] units = {12, 8, 13, 29, 50};
    static final String[] descs = {"Java T-shirt", "Java Mug", "Duke Juggling Dolls",
            "Java Pin", "Java Key Chain"};

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao ten file: ");
        dataFile= sc.next();

        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
        for (int i = 0; i < prices.length; i++) {
            try {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            } catch (IOException ex) {
                //  Logger.getLogger(dataStream.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        out.close();
        // Đọc dữ liệu

        DataInputStream in = new DataInputStream(new BufferedInputStream
                (new FileInputStream(dataFile)));
        double price;
        int unit;
        String desc;
        double total = 0.0;
        while (true) {
            try {
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();
                System.out.format("You ordered %d" + " units of %s at $%.2f%n",
                        unit, desc, price);
                total += unit * price;
            } catch (IOException ex) {
                in.close();
            }
        }
    }
}
