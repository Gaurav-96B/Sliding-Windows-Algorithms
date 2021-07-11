/*Brute Force Approach:
TC-O(n*n)
SC-O(1)*/
class Solution {
    int maxLen(int[] arr, int N)
    {
     
     for(int i=0;i<N;i++)
     {
         if(arr[i]==0)
         {
             arr[i]=-1;
         }
         else
         {
             arr[i]=1;
         }
     }
        int sum=0;
        int k=0;
        int max=0;
        for(int i=0;i<N;i++)
        {
            sum=0;
            for(int j=i;j<N;j++)
            {
               sum=sum+arr[j];
               if(sum==k)
               {
                 max=Math.max(max,j-i+1); 
               }
            }
        }
	        return max;   
    }
}



/*Optimal Aprroach:
TC-O(n)
SC-O(n)*/
class Solution {
    int maxLen(int[] arr, int N)
    {
     for(int i=0;i<N;i++)
        {
            if(arr[i]==0)
            {
                arr[i]=-1;
            }
            else
            {
                arr[i]=1;
            }
        }
        int k=0;
        Map<Integer,Integer>map=new HashMap<>();
	        int currsum=0;
	        int maxlen=0;
	        int i=0;
	        while(i!=N)
	        {
	            currsum=currsum+arr[i];
	            if(currsum==k)
	            {
	                maxlen=i+1;
	            }
	            if(map.containsKey(currsum-k)==true)
	            {
	                if((i-map.get(currsum-k))>maxlen)
	                {
	                    maxlen=i-map.get(currsum-k);
	                }
	            }
	            if(map.containsKey(currsum)==false)
	            {
	                map.put(currsum,i);
	            }
	            i++;
	        }
	        return maxlen;   
    }
}
