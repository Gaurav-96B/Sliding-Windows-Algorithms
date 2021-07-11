/*Brute Force Approach:
TC-O(n*n)
SC-O(1)*/
class Solution{

    int maxSubarraySum(int arr[], int n){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+arr[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
    
}

/*Optimal Approach
TC-O(n)
SC-o(1)*/
public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            max=Math.max(max,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;  
    }
