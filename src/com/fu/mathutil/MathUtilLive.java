package com.fu.mathutil;

/**
 *
 * @author lpdie
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: " + result);

        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));

        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0));

        System.out.println("2! = 2; actual: " + MathUtil.getFactorial(2)); // test CI

//THÊM CODE SAU LẦN ĐẦU 7:33 P.M 5/1/2024
        System.out.println("1! = 1; actual: " + MathUtil.getFactorial(1));
//        MathUtil.getFactorial(-5); ném ngoại lệ thật rồi
        // kĩ thuật kiểm thử phần mềm : ước lượng xem giá trị trả về của hàm là gì 
        // expected value: 5! = 120
        // giá trị khi chạy thực tế là mấy - actual, giả sử 120
        // if expected == actual, hàm ngon trong tình huống này
    }

}
