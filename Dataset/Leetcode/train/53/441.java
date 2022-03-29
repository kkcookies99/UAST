 class Solution {
    public int XXX(int[] nums) {
    	int[] pre = new int[30019];
    	int[] mn = new int[30019];
    	int mm;
    	int n = nums.length;
    	pre[0] = 0;
    	pre[1] = nums[0];
    	for(int i=2;i<=n;i++) {
            pre[i] = nums[i-1];
    		pre[i] += pre[i-1];
    	}
    	mm = pre[0];
    	mn[0] = 0;
    	for(int i=1;i<=n;i++) {
    		if (pre[i] < mm) {
    			mm = pre[i];
    			mn[i] = i;
    		}
    		else {
    			mn[i] = mn[i-1];
    		}
    	}
    	
    	int ans = pre[n];
    	for (int i=1;i<=n;i++) {
    		if (pre[i]-pre[mn[i-1]] > ans) {
    			ans = pre[i] - pre[mn[i-1]];
    			
    		}
    	}
    	return ans;
    }
}

