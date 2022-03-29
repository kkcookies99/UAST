 class Solution {
public:
    //贪心算法：若当前所指元素之前的和<0,则丢弃之前的值；若>0,则加上当前的值；
    int XXX(vector<int>& nums) {
        int pre_sum = -1;
        int max = -2147483648;
        for(const int ch:nums){
            if(pre_sum < 0){
                pre_sum = ch;
            }else{
                pre_sum += ch;
            }
            if(pre_sum > max){
                max = pre_sum;
            }
        }
        return max;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


