public class Main {
    public static String GiaVe(int a) {
        String s = "";
        if (a < 0 || a > 120) {
            s = "Độ tuổi không hợp lệ. Xin nhập lại";
        } else if (a >= 0 && a <= 9) {
            s = "Miễn Phí";
        } else if (a >= 10 && a <= 19) {
            s = "30000 đồng";
        } else if (a >= 20 && a <= 59) {
            s = "50000 đồng";
        } else {
            s = "30000 đồng";
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}