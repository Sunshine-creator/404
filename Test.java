import  java.util.Arrays;
public class Test {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 67, 7, 23};
//        System.out.println(isSorted);
//    }
//        System.out.println(isSorted(arr));
//    }
//        public static boolean isSorted(int[] arr) {   //数组的有序
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i ] > arr[i+1]) {
//                    return false;
//                }
//            }
//            return true;
//       int arr [] ={12,23,4,56,54,78,34,67,99,232,454};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));       //排序
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//        }
//        public static void bubbleSort(int [] arr){
//        for(int i =0;i<arr.length;i++){
//            for(int d =arr.length-1;d>i;d--){        //冒泡排序
//                if(arr[d-1]>arr[d]){
//                    int temp = arr[d-1];
//                    arr[d-1] =arr[d];
//                    arr[d] = temp;
//                }
//            }
////        }
//        int[] arr = {1, 2, 3, 4, 5, 67, 7, 23};
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//        }
//        public static void reverse( int [] arr){
//             int left = 0;
//             int right =  arr.length-1;
//             while(left<right){                     //数组逆序
//                 int temp =arr[left];
//                 arr[left] =  arr[right];
//                 arr[right] = temp;
//                 left++;
//                 right--;
//             }
//        int[] arr = {1, 2, 3, 4, 5, 67, 7, 23};
//        transform(arr);
//        System.out.println(Arrays.toString(arr));
//        }
//        public static void transform(int[] arr){
//        int left =0;
//        int right =  arr.length-1;
//        while(left<right){
//            while(left<right && arr[left] % 2==0){
//                left ++;
//            }
//            while(left<right && arr[right] %2 !=0){       //数组中的偶数在前，奇数在后
//                right--;
//            }
//            int temp =arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//        }
        int arr[][] = {
                {12, 23, 34, 45, 56},
                {21, 23, 35, 67, 87},
                {545, 67, 87, 89, 46}
        };
           for(int row =0;row<arr.length;row++){
           for(int col =0;col < arr[row].length;col++){      //打印二维数组中的元素
                System.out.printf("%d\t",arr[row][col]);
            }
            System.out.println("");
        }
    }
}




       int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(avg(arr));
    }
    public  static  double avg(int []arr){     //求数组平均数
        int sum = 0;
        for(int x: arr){
            sum +=x;
        }
        return  (double)sum/(double)arr.length ;
        int [] arr =  {1,34,56,68,89,877};
        System.out.println(find(arr,877));
    }
    public static int find(int []arr,int num){      //在数组中找一个元素的位置
        for(int i =0;i<arr.length;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return  -1;
        int arr[] = {12, 23, 34, 45, 56, 67, 78, 89, 133};
        System.out.println(binarySearch(arr, 78));
    }

    public static int binarySearch(int[] arr,int num) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + (right - left) >> 1);
            if (num < arr[mid]) {
                right = mid - 1;
            } else if (num > arr[mid]) {
                left = mid + 1;
            } else {                                          //二分法查找数组中的元素
                return mid;
            }
        }
        return -1;
              int []arr1 =  Arrays.copyOf(arr,arr.length);
              int []arr2 =  Arrays.copyOfRange(arr,1,5);   //复制数组和边界
              System.out.println("arr2:" +Arrays.toString(arr2));
              System.out.println("arr1:" +Arrays.toString(arr1));

            int arr[] ={1,2,3,4,5,6};
            System.out.println(toString(arr));
    }
    public  static  String toString(int[] arr) {   2数组转化为字符串
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i != arr.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
       int max =  arr[0];
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max){              //找数组中的最大元素
               max = arr[i];
           }
       }
       return  max;


          int arr[] ={1,2,3,4,5,6};
          String newArr = Arrays.toString(arr);
          System.out.println(newArr);               //1数组转化为字符串
        int arr[] ={1,2,3};
        int [] output = transform(arr);
        printfArrary(output);
    }
    public  static  void printfArrary(int[] arr){
        for(int x :arr){
            System.out.println(x);
        }
    }
    public  static  int[] transform(int[] arr){     //数组的每个元素乘二
      int [] ret = new  int[arr.length];
      for(int i =0;i<arr.length;i++){
          ret[i] = arr[i] *2;
      }
      return ret;
