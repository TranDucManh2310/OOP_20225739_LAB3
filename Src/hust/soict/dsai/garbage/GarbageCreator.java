package hust.soict.dsai.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        // Tạo rác vô hạn với việc nối chuỗi bằng toán tử "+"
        String s = "";
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            s += "garbage";  // Lặp đi lặp lại tạo chuỗi
        }

        // Mã này có thể làm cho chương trình bị treo hoặc dừng lại nếu tạo quá nhiều "garbage"
    }
}
