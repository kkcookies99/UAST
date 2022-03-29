 int singleNumber(vector<int>& nums) {
        int result = 0;	//0异或任何数等于其本身
        for (int i = 0; i < nums.size(); ++i) {
            result ^= nums[i];
        }
        return result;
    }

