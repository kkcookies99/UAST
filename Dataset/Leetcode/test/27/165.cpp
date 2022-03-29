 class Solution {
public:
    int static XXX(vector<int> &nums, int val) {

        vector<int>::iterator iterator;
        for (iterator = nums.begin(); iterator != nums.end(); iterator++) {

            if (*iterator == val) {
                iterator = nums.erase(iterator);
                iterator--;
            }
        }
        return  nums.size();
    }
};

