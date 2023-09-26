import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //  Test theo giá trị biên
    @Test
    public void Out_Of_Min(){
        int a = -1;
        String expected = "Độ tuổi không hợp lệ. Xin nhập lại";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Min_1(){
        int a = 0;
        String expected = "Miễn Phí";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Nom_1(){
        int a = 5;
        String expected = "Miễn Phí";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Max_1(){
        int a = 9;
        String expected = "Miễn Phí";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Min_2(){
        int a = 10;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Nom_2(){
        int a = 15;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Max_2(){
        int a = 19;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Min_3(){
        int a = 20;
        String expected = "50000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Nom_3(){
        int a = 40;
        String expected = "50000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Max_3(){
        int a = 59;
        String expected = "50000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Min_4(){
        int a = 60;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Nom_4(){
        int a = 90;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Max_4(){
        int a = 120;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Out_Of_Max(){
        int a = 121;
        String expected = "Độ tuổi không hợp lệ. Xin nhập lại";
        String actual = Main.GiaVe(a);
        assertEquals(expected,actual);
    }

    //  Test theo bảng quyết định
    @Test
    public void Test1(){
        int a = 1000;
        String expected = "Độ tuổi không hợp lệ. Xin nhập lại";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void Test2(){
        int a = 6;
        String expected = "Miễn Phí";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void Test3(){
        int a = 10;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void Test4(){
        int a = 23;
        String expected = "50000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void Test5(){
        int a = 119;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
}