/*Brute Force Approach:
TC-O(n*n)
SC-O(1)*/
class Solution
{
    public static int lenOfLongSubarr (int A[], int n, int k) {
       int sum=0;
       int max=0;
       for(int i=0;i<n;i++)
       {
           sum=0;
           for(int j=i;j<n;j++)
           {
               sum=sum+A[j];
               if(sum==k)
               {
                   max=Math.max(max,j-i+1);
               }
           }
       }
       return max;
    }
    
    
}

/*Optimal Approach:
TC-O(n)
SC-O(n)*/
class Solution
{
    public static int lenOfLongSubarr (int A[], int n, int k) {
       Map<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+A[i];
            if(sum==k)
            {
               max=Math.max(max,i+1);
            }
           if(map.containsKey(sum-k)==true)
           {
               max=Math.max(max,(i-map.get(sum-k)));
           }
           if(map.containsKey(sum)==false)
           {
             map.put(sum,i);
           } 
        }
        return max;
    }  
}


