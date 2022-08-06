class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        long ans[]=new long[m+n];
        for(int i=0;i<n;i++)
        {
            ans[i]=arr1[i];
        }
         for(int i=0;i<m;i++)
        {
            ans[i+n]=arr2[i];
        }
        Arrays.sort(ans);
        for(int i=0;i<n;i++)
        {
            arr1[i]=ans[i];
        }
        int k=0;
        for(int i=n;i<m+n;i++)
        {
            arr2[k++]=ans[i];
        }
    }
}
