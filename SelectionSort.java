public class SelectionSort{
    public static void main(String[] args) {
        int [] arr ={6,8,9,5,4};
        for(int i=0;i<arr.length;i++){
            SelectionSort1(arr);
            System.out.println(arr[i]);  
        }      
    }
    public static void  SelectionSort1(int arr[]){
        int n=arr.length;
        int k;
        for (int i=0;i<n-1;i++){
            for(int j=k=i;j<n;j++){ //all the three pointers start with the same location 
                if(arr[j]<arr[k]){
                    k=j;
                }
            }
            //swap i wth k values as it is compared and the condition is satisfied
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
    }

}