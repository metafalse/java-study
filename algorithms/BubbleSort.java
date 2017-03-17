public class BubbleSort {
  public static void main(String[] args) throws Exception {
    int arr[] = {4, 2, 5, 3, 1};
    bubbleSort(arr);
    for (int v: arr)
      System.out.println(v);
  }
  
  public static void bubbleSort(int[] arr) {
    for (int i = arr.length - 1; i >= 1; i--)
      for (int j = 0; j < i; j++)
        if (arr[j] > arr[j+1]) swap(arr, j, j+1);
  }
  
  public static void swap(int[] arr, int a, int b) {
    int tmp = arr[a];
    arr[a] = arr[b];
    arr[b] = tmp;
  }
}
