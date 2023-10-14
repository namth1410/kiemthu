import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    /**
     * Test theo all use
     */
    @Test
    public void allUsea1(){
        int a = -1;
        String expected = "Độ tuổi không hợp lệ. Xin nhập lại";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void allUsea2(){
        int a = 5;
        String expected = "Miễn Phí";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void allUsea3(){
        int a = 16;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void allUsea4(){
        int a = 28;
        String expected = "50000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void allUsea5(){
        int a = 70;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void allUseb1(){
        int a = 130;
        String expected = "Độ tuổi không hợp lệ. Xin nhập lại";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void allUseb2(){
        int a = 5;
        String expected = "Miễn Phí";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void allUseb3(){
        int a = 16;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void allUseb4(){
        int a = 28;
        String expected = "50000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void allUseb5(){
        int a = 70;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }


    /**
     * Test theo dong dieu kien
     */
    @Test
    public void C1(){
        int a = 125;
        String expected = "Độ tuổi không hợp lệ. Xin nhập lại";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void C2(){
        int a = 3;
        String expected = "Miễn Phí";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void C3(){
        int a = 16;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void C4(){
        int a = 28;
        String expected = "50000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void C5(){
        int a = 70;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }

    /**
     * Test theo giá trị biên
     */
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

    /**
     * Test theo phân hoạch tương đương
     */
    @Test
    public void _test0(){
        int a = -100;
        String expected = "Độ tuổi không hợp lệ. Xin nhập lại";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void _test1(){
        int a = 5;
        String expected = "Miễn Phí";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void _test2(){
        int a = 15;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void _test3(){
        int a = 40;
        String expected = "50000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void _test4(){
        int a = 90;
        String expected = "30000 đồng";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void _test5(){
        int a = 125;
        String expected = "Độ tuổi không hợp lệ. Xin nhập lại";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }

    /**
     * Test theo bảng quyết định
     */
    @Test
    public void Test0(){
        int a = -10;
        String expected = "Độ tuổi không hợp lệ. Xin nhập lại";
        String actual = Main.GiaVe(a);
        assertEquals(expected, actual);
    }
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