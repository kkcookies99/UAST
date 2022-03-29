 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target);
};
vector<int> Solution::XXX(vector<int>& nums, int target)
{
    int length;
    vector<int> result;
    length = nums.size();
    for(int i=0; i<length; i++)
    {
        for (int j=i+1; j<length; j++)
        {
            if (nums[i] == target-nums[j] ){
                result.push_back(i);
                result.push_back(j); 
                
                }            
        }
    }
    return result;
}

