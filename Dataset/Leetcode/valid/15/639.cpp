 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        const int size = (int)nums.size();
        vector<vector<int>> ret;

        if (size < 3)
        {
            return ret;
        }
        
        sort(nums.begin(),nums.end());

        for (int i = 0; i < size -2;++i)
        {
            if (nums[i] > 0)
            {
                break;
            }

            if (i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }

            int head = i+1;
            int tail = size-1;

            while (head < tail)
            {
                int target = nums[i] + nums[head] + nums[tail];
                if (target == 0)
                {
                    ret.push_back({nums[i],nums[head],nums[tail]});

                    while (head < tail && nums[head] == nums[head+1])
                    {
                        ++head;
                    }

                    while (head < tail && nums[tail] == nums[tail-1])
                    {
                        --tail;
                    }

                    ++head;
                    --tail;
                }
                else if (target < 0)
                {
                    ++head;
                }
                else 
                {
                    --tail;
                }
            }
        }

        return ret;
    }
};

