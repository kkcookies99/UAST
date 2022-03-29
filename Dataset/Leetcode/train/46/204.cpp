class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> re;
        re.push_back(nums);
        fun(re, nums, 0, nums.size());
        return re;
    }

    //str不能引用; startIndex表示子序列头部元素位置
    void fun(vector<vector<int>>& re, vector<int> str, int startIndex, int len){
        if(len<2) return;//子序列仅剩一个元素则退出
        fun(re, str, startIndex+1, len-1);//处理刚进入递归的除头部starIndex的子序列

        //子序列中每个元素分别交换头部startIndex元素后的递归处理
        for(int i=1; startIndex+i < str.size(); ++i){
            swap(str[startIndex], str[startIndex+i]);
            re.push_back(str);
            fun(re, str, startIndex+1, len-1);

            swap(str[startIndex], str[startIndex+i]);//勿遗漏，还原
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


