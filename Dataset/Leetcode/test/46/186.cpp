class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
       	vector<vector<int> > result;
       	vector<int> res;
       	vector<int> visit(nums.size(),0);
       	fun(result,nums,0);
       	return result;
    }
    void fun(vector<vector<int> >& result, vector<int>& nums, int k){
    	if(k == nums.size()){
    		result.push_back(nums);
    		return ;
    	}
    	for(int i=k;i<nums.size();i++){
    		swap(nums[i],nums[k]);
    		fun(result, nums, k+1);
    		swap(nums[i],nums[k]);
    	}
    }

};

