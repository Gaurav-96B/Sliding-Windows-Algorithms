
/*Brute Force Approach:
TC-O(n*n)
SC-o(1)*/
class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
              sum=sum+a[j];  
              if(sum%k==0)
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
SC-o(n)*/

class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        Map<Integer,Integer>map=new HashMap<>();
	      int currsum=0;
	      int maxlen=0;
	      int i=0;
	      while(i!=n)
	      {
	          currsum=currsum+a[i];
	          if((((currsum % k) + k) % k)==0)
	          {
	             maxlen=i+1; 
	          }
	          if(map.containsKey(((currsum % k) + k) % k)==true)
	          {
	              maxlen=Math.max(maxlen,i-map.get(((currsum % k) + k) % k));
	          }
	          if(map.containsKey(((currsum % k) + k) % k)==false)
	          {
	              map.put((((currsum % k) + k) % k),i);
	          }
	          i++;
	      }
	      return maxlen;
    }
 
}
