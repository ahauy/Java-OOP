package bai02;

//import javax.sound.midi.InvalidMidiDataException;

public class Test {


    public static void main(String[] args) {
        try {
            // thoi gian hop le : 
            ThoiGian time1 = new ThoiGian(23, 01, 2005);
            // thoi gian hop le : 
            System.out.println(time1.toString());
            // thoi gian khong hop le :
            ThoiGian time2 = new ThoiGian(0, 01, 2006);
            System.out.println(time2.toString());
        }catch(InvalidDateException ide) {
            System.out.println("ERROR : " + ide.getMessage());
        }finally {
            System.out.println("Ket thuc chuong trinh !!");
        }

    }
}
