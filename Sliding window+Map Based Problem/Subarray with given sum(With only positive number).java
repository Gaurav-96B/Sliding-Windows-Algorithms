/*Brute Force Approach:
TC-O(n*n)
SC-O(1)*/
class Solution
{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int sum=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            sum=0;
           for(int j=i;j<n;j++)
           {
               sum=sum+arr[j];
               if(sum==s)
               {
                  ans.add(i+1);
                  ans.add(j+1);
                  return ans;
               }
           }
        }
        ans.add(-1);
        return ans;
    }
}

/*Optimal Approach:
TC-O(n)
SC-O(1)*/
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
