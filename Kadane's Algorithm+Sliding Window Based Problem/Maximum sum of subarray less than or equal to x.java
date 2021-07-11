/*Brute Force Approach:
TC-O(n*n)
SC-O(1)*/

class Solution
{
    long findMaxSubarraySum(long arr[], int N,int X)
    {
        long sum=0;
        long max=0;
        int startIndex=0;
        for(int i=0;i<N;i++)
        {
            sum=0;
            for(int j=i;j<N;j++)
            {
              sum=sum+arr[j];
              if(sum<=X)
              {
                  max=Math.max(max,sum);
              }
            }
        }
        return max;
    }
}








/*Optimal Approach:
TC-O(n)
SC-o(1)*/
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
