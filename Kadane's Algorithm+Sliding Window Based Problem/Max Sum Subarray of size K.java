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
