class Solution {
public:
    void XXX(vector<int>& nums) {
            int n = nums.size();
    auto it = nums.begin();
    int indx =0;
    for (int i = 0; i < n; i++)
    {
        if (*it == 0)
        {
            nums.insert(nums.begin(), 0);
            it = nums.begin() + i+1-indx;
            it = nums.erase(it);
        }
        else if (*it == 2)
        {
            it = nums.erase(it);
            nums.push_back(2);
            indx++;
        }
        else
        {
            it++;
        }
    }
    }
};

