//1089. Duplicate Zeros
//Time complexity:o(N);
//Space complexity:o(1);
class Solution {
    public void duplicateZeros(int[] arr) {
        
        //Calculate number of zeros
        int zeros=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zeros++;
            }
        }
        
        //Using Two pointers approach
        
        //Initial array length;
        int i=arr.length-1;
        //Extended array length;
        int j=(arr.length-1)+zeros;
        
        while(i!=j)
        {
            //Initially we will copy the element at ith position to jth positiom
            insert(arr, i, j--);
            if(arr[i]==0)
            {
                insert(arr, i, j--);
            }
            i--;
        }
        
    }
    
    private void insert(int[] arr, int i, int j)
    {
        if(j<arr.length)
        {
            arr[j]=arr[i];
        }
    }
        
}
