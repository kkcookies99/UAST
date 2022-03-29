 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> vec;
        for(int i=0;i<100000000;i++){
            int a=rand()%nums.size();
            int b=rand()%nums.size();
            if(a!=b&&nums[a]+nums[b]==target){
                    vec.push_back(a);
                    vec.push_back(b);
                    break;
            }
        }
        return vec;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


