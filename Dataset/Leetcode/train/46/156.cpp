class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums)
    {
        std::vector<vector<int>> vecPerm;
        if (nums.empty()) return std::vector<vector<int>>();
                
        std::function<void(std::vector<int>&, int, int)> lamb_Perm = 
            [&lamb_Perm, &vecPerm](std::vector<int>& vecNums, int iIndex, int iRight) -> void
        {
            if (iRight - 1 == iIndex)
            {
                vecPerm.push_back(vecNums);
                return;
            }
            
            for (size_t i = iIndex; i < iRight; i++)
            {
                std::swap(vecNums.at(iIndex), vecNums.at(i));
                lamb_Perm(vecNums, iIndex + 1, iRight);
                std::swap(vecNums.at(iIndex), vecNums.at(i));
            }
        };
        
        lamb_Perm(nums, 0, nums.size());
        return vecPerm;
    }
};

