class Solution {
public:
	vector<vector<int> > XXX(vector<int>& nums) {
		vector<vector<int> > vs;
		sort(nums.begin(),nums.end());
		do{
			vs.push_back(nums);
		}while(next_permutation(nums.begin(),nums.end()));
		return vs;
	}
};

