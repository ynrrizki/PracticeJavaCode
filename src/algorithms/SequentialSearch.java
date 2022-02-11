package algorithms;

public class SequentialSearch {
    // Check dengan menampilkan indeks data nya
    static int sequentialCheckIndex(int listData[], int data) {
        for (int i = 0; i < listData.length; i++) {
            if (data == listData[i]) {
                return i;
            }
        }
        return -1;
    }

    // Check dengan boolean
    static boolean sequentialCheck(int listData[], int data) {
        for (int i = 0; i < listData.length; i++) {
            if (data == listData[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int listData[] = { 12, 33, 5, 7, 9, 10 };
        int data = 10;

        System.out.println(sequentialCheck(listData, data));
        System.out.println(sequentialCheckIndex(listData, data));
    }
}
