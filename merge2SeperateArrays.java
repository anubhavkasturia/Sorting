

public class merge2SeperateArrays{
    public static void main(String[] args) {
        int[] A={1,2,5,4,3};
        int[] B={2,4,1};
        int[] result= new int[A.length+B.length];

        for(int i=0;i<result.length;i++){
        Merge2SeperateArrays(A, B, A.length, B.length,result);
        System.out.println(result[i]);
        }
    }
     
    public static void Merge2SeperateArrays(int[]A,int[]B,int m,int n,int[]result){
        int i,j,k;
        i=j=k=0;
        while(i<m && j<n){
            if(A[i]<B[j]){
                result[k]=A[i];
                k++;
                i++;
            }else{
                result[k]=B[j];
                k++;
                j++;

            }
        }
    //left out elements
    if(i>=m){
        while (j<n){
            result[k]=B[j];
            k++;
            j++;

        }
    }
    if(j>=n){
        while (i<m){
            result[k]=A[i];
            k++;
            i++;
    }
}
    }
}