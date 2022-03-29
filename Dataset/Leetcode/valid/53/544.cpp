 class Solution {
public:
    int XXX(vector<int>& nums) {
        int result=INT_MIN;
        int sum=0;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
            result=max(result,sum);
            if(sum<0)
                {
                    sum=0;
                    continue;
                } 
        }
        return result;

    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


