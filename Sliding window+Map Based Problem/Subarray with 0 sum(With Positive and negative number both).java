/*Brute Force Approach:
TC-O(n*n)
SC-O(1)*/
class Solution{
    static boolean findsum(int A[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
               sum=sum+A[j];
               if(sum==0)
               {
                   return true;
               }
            }
        }
        return false;
    }
}

/*Optimal Approach
TC-O(n)
SC-O(n)*/

class Solution{
    static boolean findsum(int A[],int n)
    {
        Map<Integer,Integer>map=new HashMap<>();
        int k=0;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+A[i];
            if(sum==k)
            {
               return true;
            }
           if(map.containsKey(sum-k)==true)
           {
               return true;
           }
           if(map.containsKey(sum)==false)
           {
             map.put(sum,i);
           }
          
        }
        return false;
    }
}
