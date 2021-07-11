/*Brute Force Approach:
TC-O(n*k)
SC-O(1)*/

class Solution{
    static int maximumSumSubarray(int K, ArrayList<Integer> Arr,int n){
        int max=0;
        int sum=0;
        for(int i=0;i<=n-K;i++)
        {
            sum=0;
            for(int j=i;j<i+K;j++)
            {
                sum=sum+Arr.get(j);
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}







/* Optimal Approach:
TC-O(n)
SC-o(1)*/
class Solution{
    static int maximumSumSubarray(int k, ArrayList<Integer> Arr,int N){
        
        int sum=0;
        int max=Integer.MIN_VALUE;
        int startIndex=0;
        for(int i=0;i<N;i++)
        {
          sum=sum+Arr.get(i);
          if(i>=k-1)
          {
            max=Math.max(max,sum);
            sum=sum-Arr.get(startIndex);
            startIndex++;
          }
        }
        return max;
    }
}
