
class Solution
{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int sum=0;
        ArrayList<Integer>a=new ArrayList<>();
        int startIndex=0;
        for(int i=0;i<n;i++)
        {
          sum=sum+arr[i];
          while(sum>s)
          {
              sum=sum-arr[startIndex];
              startIndex++;
              
          }
          if(sum==s)
          {
            a.add(startIndex+1);
            a.add(i+1);
            return a;
          }
        }
        a.add(-1);
        return a;
    }
}



class Solution
{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int sum=0;
        ArrayList<Integer>a=new ArrayList<>();
        int startIndex=0;
        for(int i=0;i<n;i++)
        {
          sum=sum+arr[i];
          while(sum>s)
          {
              sum=sum-arr[startIndex];
              startIndex++;
              
          }
          if(sum==s)
          {
            a.add(startIndex+1);
            a.add(i+1);
            return a;
          }
        }
        a.add(-1);
        return a;
    }
}
