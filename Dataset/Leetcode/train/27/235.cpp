 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        vector<int>::iterator iter1;
        iter1=remove(nums.begin(),nums.end(),val);
        int length=0;
        for(vector<int>::iterator iter2=nums.begin();iter2!=iter1;iter2++)
            length++;
        return length;
    }
};


