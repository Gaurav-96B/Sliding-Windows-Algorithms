class Solution
{
    long findMaxSubarraySum(long arr[], int N,int X)
    {
        long sum=0;
        long max=0;
        int startIndex=0;
        for(int i=0;i<N;i++)
        {
          sum=sum+arr[i];  
          if(sum>X)
          {
              while(sum>X)
              {
                  sum=sum-arr[startIndex];
                  startIndex++;
              }
          }
          if(sum<=X)
          {
          max=Math.max(max,sum);
          }
        }
        return max;
    }
}
