package algorithms;

public class SequintialSearch {
    static boolean sequintial(int listData[], int data) {
        for(int i = 0; i < listData.length; i++) {
            if (data == listData[i]) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int listData[] = {12, 33, 5, 7, 9, 10};
        int data = 1;
        
        System.out.println(sequintial(listData, data));
    } 
}
