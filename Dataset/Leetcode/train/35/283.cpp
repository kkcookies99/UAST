 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int n1 = 0;
        int n2 = nums.size()-1;
        int nMid;
        while(n1 <= n2){
            nMid = nums[int((n1+n2+1)/2)];
            if(target < nMid){
                if(n1 == n2)return n1;
                n2 = int((n1+n2+1)/2)-1;
            }
            else if(target > nMid){
                if(n1 == n2)return ++n1;
                n1 = int((n1+n2+1)/2)+1;
            }
            else
                return int((n1+n2+1)/2);
        }
        return n2+1;
    }
};

