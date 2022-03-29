 class Solution {
public:
    void XXX(vector<int>& nums) {
        vector<int> vec={0,0,0};
        for(auto index:nums){
            vec[index]++;
        }
        int k = 0;
        for(int i=0;i<nums.size();)
        {
            while(vec[k]!=0)
            {
                nums[i++] = k;
                vec[k]--;
            }
            k++;
            if(k==3)
                break;
        }
    }
};```

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


