package algorithms;

public class SequintialSearch {
    // Check dengan menampilkan indeks data nya
    static int sequintialCheckIndex(int listData[], int data) {
        for (int i = 0; i < listData.length; i++) {
            if (data == listData[i]) {
                return i;
            }
        }
        return -1;
    }

    // Check dengan boolean
    static boolean sequintialCheck(int listData[], int data) {
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

        System.out.println(sequintialCheck(listData, data));
        System.out.println(sequintialCheckIndex(listData, data));
    }
}
