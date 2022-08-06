class Solution
{
    static int majorityElement(int a[], int n)
    {
        // your code here
        int maj=-1;
        Map<Integer,Integer>map=new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            
        }
        for(Map.Entry<Integer,Integer>i:map.entrySet())
        {
            if(i.getValue()>n/2)
            {
                maj=i.getKey();
            }
        }
        return maj;
    }
}
