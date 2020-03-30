public class bubbleSort{
    public static void main(String[] args) {
        int[] arr={1,22,3,4,5};
        
        for(int i=0;i<arr.length;i++){
        bubbleSort1(arr);
        System.out.println(arr[i]);
    }
}
    public static void bubbleSort1(int[]array){
        int n=5;
        for(int i=0;i<n-1;i++){ //no. of passes controller
            for(int j=0;j<n-1-i;j++){ //no. of swaps within a pass
                if(array[j]>array[j+1]){
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
      }
    }
}