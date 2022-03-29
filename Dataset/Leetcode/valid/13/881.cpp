 class Solution {
public:
    int XXX(string s) {
        vector<string> strs{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        vector<int> nums{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int res=0,ptr=0;
        for(int i=0;i<strs.size();){
            while(s.find(strs[i],ptr)==ptr){
                res+=nums[i];
                ptr+=strs[i].size();
            }++i;
        }
        return res;
    }
};

