package bai12;

public class Test {
    public static void main(String[] args) {
        Nguoi pr;
        
        pr = new SVCDN();
        pr.nhap();
        pr.tinhDiem();
        System.out.println(pr);

        pr = new SVCDCQ();
        pr.nhap();
        pr.tinhDiem();
        System.out.println(pr);
    }
}
