class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        backtracking(nums,0,ans);
        return ans;
    }

    //level的好处是我们可以选择一个位置，比如这题输的是0，那么我们从第1位开始排列组合，输入1的话可以从第2位开始排列组合
    void backtracking(vector<int>&nums,int level,vector<vector<int>>&ans){ 
        if(level == nums.size()-1){ //递归停止的条件，将当前数组插到ans里面
            ans.push_back(nums);
            return;
        }
        //我们最开始的level是0，那么下面的for就会将数组nums的第一位改变nums.size()次(自己跟自己交换也算一次改变)
        //在nums的第一位改变一次之后(swap(nums[i],nums[level]))，还要改变nums的第二位(调用backtracking(nums,level+1,ans))
        //但在改变第二位一次后，我们还要改变第三位，以此类推，直至后面位改变完成，才能进行第二次改变
        /*比如[1,2,3，4]，我们存入ans的第一个是[1,2,3,4]（倒数第二位改变一次(自己跟自己交换)之后，想改变倒数第一位，
        发现level == nums.size()-1了，所以递归到头，将当前数组[1,2,3,4]插到ans里面,同时回改数组，即第二个swap）*/
        //倒数第二位改变第二次后，数组为[1,2,4,3]，同样想改变倒数第一位时发现level == nums.size()-1，于是将当前数组插入ans,并回改数组
        //倒数第二位改变完成，轮到倒数第三位第二次改变，即当前数组为[1,3,2,4],第二次更改依旧要改变倒数第三位，以此类推
        for(int i =level;i < nums.size();++i){ 
            swap(nums[i],nums[level]); 
            backtracking(nums,level+1,ans);
            swap(nums[i],nums[level]);
        }
    }
};

