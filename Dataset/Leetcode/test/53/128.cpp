class Solution {
public:
    int XXX(vector<int>& nums) {
        int s = 0;
        int e = nums.size() - 1;
        int maxValue = maxSubRec(nums, s, e);
        return(maxValue);
    }
    
    int maxSubRec(vector<int>& nums, int s, int e) {
        if(s == e) {
            return(nums[s]);
        }
            
        int c = (s + e) / 2;
        int maxLeftSum = maxSubRec(nums, s, c);
        int maxRightSum = maxSubRec(nums, c + 1, e);
        
        int maxLeftBorderSum = nums[c];
        int leftBorderSum = 0;
        for(int i = c; i >= s; --i) {
            leftBorderSum += nums[i];
            if(leftBorderSum > maxLeftBorderSum) {
                maxLeftBorderSum = leftBorderSum;
            }
        }
        
        int maxRightBorderSum = nums[c + 1];
        int rightBorderSum = 0;
        for(int i = c + 1; i <= e; ++i) {
            rightBorderSum += nums[i];
            if(rightBorderSum > maxRightBorderSum) {
                maxRightBorderSum = rightBorderSum;
            }
        }
        
        return max3(maxLeftSum, maxRightSum,maxLeftBorderSum +  maxRightBorderSum); 
    }
    
    int max3(int a, int b, int c) {
        int maxValue = 0;
        maxValue = a > b ? a : b;
        maxValue = maxValue > c ? maxValue : c;
        return maxValue;
    }
    
};

