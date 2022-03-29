 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        if(nums.size() < 3) return res;
        sort(nums.begin(), nums.end());
        for(auto ptr1 = nums.begin(); ptr1 != nums.end()-2; ++ptr1){
            if(ptr1 == nums.begin() || *ptr1 != *(ptr1-1)){
                vector<int>::iterator ptr3 = nums.end() - 1;
                for(auto ptr2 = ptr1 + 1; ptr2 != nums.end() - 1; ++ptr2){
                    if(ptr2 == ptr1 + 1 || *ptr2 != *(ptr2 - 1)){
                        while(*ptr3 > -(*ptr1 + *ptr2) && ptr3 > ptr2){
                            --ptr3;
                        }
                        if(*ptr1 + *ptr2 + *ptr3 == 0 && ptr2 < ptr3){
                            res.push_back({*ptr1, *ptr2, *ptr3});
                        }
                    }
                    if(ptr2 >= ptr3){
                        break;
                    }
                }
            }
        }
        return res;
    }
};

