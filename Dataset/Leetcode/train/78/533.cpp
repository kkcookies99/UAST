 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
		if(nums.empty()) return {{}}; //判空
		vector<vector<int> > res;
		res.push_back({});  //先把空集和各个数字作为子集加进去
		for(int a:nums)
		{
			res.push_back({a});
		}
		
		vector<int> out;
		int index = 0;     //DFS中的nums元素的下标
		DFS(nums,out,res,index);
		return res;
    }
    void  DFS(vector<int> nums,vector<int> &out,vector<vector<int> > &res,int index)
    {
    	for(int i = index;i<nums.size();i++)
    	{
    		out.push_back(nums[i]);
    		if(out.size()>=2)      //子集元素个数>=2则添加到res中
    		{
    			res.push_back(out);
			}
			DFS(nums,out,res,++index); //向下一层递归，下标要加一 
			out.pop_back();
		}
	}
};

