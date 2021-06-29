class Solution{
    static int maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
          sum=sum+Arr.get(i);
          if(i>=K-1)
          {
            max=Math.max(max,sum);
            sum=sum-Arr.get(i-(K-1));
          }
        }
        return max;
    }
}
