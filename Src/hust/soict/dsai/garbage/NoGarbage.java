package hust.soict.dsai.garbage;

public class NoGarbage {
    public static void main(String[] args) {
        // Sử dụng StringBuffer thay vì toán tử "+"
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sb.append("garbage");  // Thêm vào StringBuffer thay vì tạo chuỗi mới
        }

        // Chương trình này sẽ chạy ổn định hơn vì StringBuffer hiệu quả hơn trong việc nối chuỗi.
    }
}
