package algorithms;

public class BubbleSort {
    
    /*
        aturan bubble sort:
        array masuk ke dalam parameter,
        mulai pengurutan, dengan cara
        jika array index pertama > kedua,
        angka pertama disimpan ke variable temp,
        lalu angka kedua disimpan ke variable index array pertama
        begitu seterus-nya...
    */
    
    
    static void bubbleSort(int arr[]) {
       for(int i = 0; i < arr.length; i++) {
           for(int j = 0; j < arr.length-1; j++) {
               int temp = 0;
               if (arr[j] > arr[j+1]) {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
    }
    
    public static void main(String[] args) {
        int data[] = {4, 3, 2, 1};
        
        bubbleSort(data);
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
