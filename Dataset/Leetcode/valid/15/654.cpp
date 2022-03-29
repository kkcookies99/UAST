 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        std::sort(nums.begin(), nums.end());
        vector<vector<int>> result;
        if(nums.size() < 3)
            return result;

        int sum;
        vector<int>::const_iterator itj, itk;
        for(vector<int>::const_iterator iti = nums.begin(); *iti <= 0 && iti < nums.end() - 2; iti++)
        {
            if(iti != nums.begin() && *iti == *(iti - 1))
                continue;
            itj = (iti + 1);
            itk = (nums.end() - 1);
            while(itj != itk)
            {
                if(*itk < 0)
                    break;
                if(*itj == *(itj - 1) && (itj - 1) != iti)
                {
                    itj++;
                    continue;
                }
                if((itk + 1) != nums.end() &&　*itk == *(itk + 1))
                {
                    itk--;
                    continue;
                }
                    
                sum = *iti + *itj + *itk;
                if(sum < 0)
                {
                    itj++;
                }
                else if(sum > 0)
                {
                    itk--;
                }
                else
                {
                    result.emplace_back(vector<int>({*iti, *itj, *itk}));
                    itj++;
                }
            }
        }

        return result;
    }
};```

