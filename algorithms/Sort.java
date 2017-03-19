public class Sort {
  public static void main(String[] args) throws Exception {
    int arr[] = {8, 3, 1, 2, 7, 5, 6, 4};
    //bubbleSort(arr);
    //insertionSort(arr);
    selectionSort(arr);
    //shellSort(arr);
    for (int v: arr)
      System.out.println(v);
  }
  
  public static void bubbleSort(int[] arr) {
    for (int i = arr.length - 1; i >= 1; i--)
      for (int j = 0; j < i; j++)
        if (arr[j] > arr[j+1]) swap(arr, j, j+1);
  }
  
  public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++)
      for (int j = i-1; j >= 0; j--) {
        if (arr[j] < arr[j+1]) break;
        swap(arr, j, j+1);
      }
  }
  
  public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++)
      for (int j = i+1; j < arr.length; j++)
        if (arr[i] > arr[j]) swap(arr, i, j);
  }
  
  public static void shellSort(int[] arr) {
    int[] gaps = {8, 4, 2, 1};
    for (int g : gaps)
      for (int i = g; i < arr.length; i += g)
        for (int j = i; j >= g; j -= g) {
          if (arr[j-g] < arr[j]) break;
          swap(arr, j, j-g);
        }
  }
  
  public static void swap(int[] arr, int a, int b) {
    int tmp = arr[a];
    arr[a] = arr[b];
    arr[b] = tmp;
  }
}
