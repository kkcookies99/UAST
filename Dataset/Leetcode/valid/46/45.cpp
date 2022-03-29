class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> results;
        vector<int> res;
        vector<bool> flag(nums.size(),false);//标记元素是否被访问过
        return HDFS(results,res,flag,nums,0);
    }
    vector<vector<int>> HDFS(vector<vector<int>> &results,vector<int> &res,vector<bool> &flag,vector<int> nums,int dep){
        if(dep==nums.size()){//达到树叶
            results.push_back(res);
        }
        for(int i=0;i<nums.size();i++){//每层都对每个节点进行检测
            if(!flag[i]){
                flag[i]=true;//访问节点
                res.push_back(nums[i]);
                HDFS(results,res,flag,nums,dep+1);  //进入下一层
                res.pop_back();//往上一层回退
                flag[i]=false;
            }
        }
        return results;
    }
};

