package com.jane.mathutil.core;

//class này sẽ chứa các hàm static sinh ra để làm tool dùng chung cho các nơi khác.
//cái gì mà dùng chung cho nhiều nơi, nhận info, trả về info qua hàm,
//mà k cần lưu trữ gì hết, cái đó gọi là STATIC
//ĐỒ NÀO MÀ LÀ STATIC THÌ GỌI TRỰC TIẾP QUA TÊN CLASS,
//K BAO H GỌI STATIC QUA ĐƯỜNG NEW!!!
public class MathUtility {
    public static final double PI = 3.14;
    //C# public const double PI = 3.14 
    // k cần chờ static mà vẫn là static nếu có từ khóa const 
    //const C# - final Java
    
    //hàm tính n! = 1.2.3.4.....n
    //K CÓ GIAI THỪA CỦA SỐ ÂM, N<0 K ĐC TÍNH
    //NẾU N QUÁ LỚN THÌ TRẦN KIỀU LONG, LONG THÌ CHỊU ĐUỢC 18 SỐ 0
    // 20! VỪA ĐỦ 18 SÔS 0, DO ĐÓ K TÍNH GIAI THỪA TỪ 21 TRỞ ĐI
    //0!=1!=1 QUY ƯỚC
    public static long getFactorial(int n){
        if(n<0||n>20)
            throw new IllegalArgumentException("Invalid n , n must " + " be between 0..20");
        
        if(n==0||n==1)
            return 1; 
        
        return n * getFactorial(n-1); //đệ quy xong
    }
    
    
    //ĐỆ QUY - RECURSION
    //BÚP BÊ NGA - ĐỆ QUY LÀ GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
    //                        NHỎ ĐẾN 1 MỨC THÌ DỪNG LẠI
    // 5! = 1.2.3.4.5
    // 5!       4!x 5 = 5x4!
    // 4! = 1.2.3.4.5
    // 4!       3!x 5 = 4x3! đuổi nhau rồi
    // 3!             = 3x2!
    // 2!             = 2x1! DỪNG NGAY
    // N!             = N x (N-1)!
    
    
    
    // KỸ THUẬT KIỂM THỬ HỒI QUY - REGRESSION TEST
    // TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST ĐỂ XÁC NHẬN NÓ CÒN CÓ ỔN KO
    // TẠI SAO PHẢI TEST LẠI ???
    // CODE THEO THỜI GIAN SẼ CÓ THAY ĐỔI, THAY ĐỔI VÌ
    // 1. ANH EM FIX BUG, SẼ SỬA CODE
    // 2. ANH EM TỐI ƯU, CHỈNH SỬA CODE ĐỂ CODE ĐẸP HƠN, CHẠY TỐT HƠN NHANH HƠN
    // 3. ANH EM THÊM HÀM MỚI, METHOD MỚI
    
    // KHI SỬA CODE, PHẢI TEST LẠI ĐỂ ĐẢM BẢO NÓ VẪN NGON, VẪN XANH
    // NẾU TEST = TAY CỰC KÌ MẤT SỨC, COI CHỪNG SAI SÓT
    // NẾU CÓ TEST SCRIPT, TA CHỈ VIỆC RUN, VÀ NHÌN MÀU ĐƯA RA
    // NẾU MÀU XANH, CODE CHỈNH SỬA ỔN, VÌ THỎA EXPECTED == ACTUAL
    // NẾU MÀU ĐỎ, CODE KO ỔN, SỬA TIẾP CHO ĐẾN KHI NÀO ỔN
    // TA TEST LẠI MÀ CHỈ CẦN NHÌN MÀU -> NHANH, KO HAO SỨC, CHÍNH XÁC
    // MIỄN ĐỦ TEST CASE, TEST SCRIPT
    
    
   // TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST GỌI LÀ TEST HỒI QUY REGRESSION
    
    
    
    
    
    
//    public static long getFactorial(int n){
//        if(n<0||n>20)
//            throw new IllegalArgumentException("Invalid n , n must " + " be between 0..20");
//        if(n==0||n==1)
//            return 1; //nếu có thể kết thúc sớm, thì kết thúc ngay
//        //sống sots đến chỗ này, sure n =2..20 vì nếu k chết dọc đường ở 2 cụm if ở trên rồi
//        //k cần else nếu trước đó mà return 
//        long result = 1; //giải thừa khởi đầu là 1
//        //nhân đôi 2 3 4 5 ...n vào biến này thì thành n!
//        for(int i = 2; i <= n; i++){
//            result *= i;
//        }
//        return result;
//    }

}
