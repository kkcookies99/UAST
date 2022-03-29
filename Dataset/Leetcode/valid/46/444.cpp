 class Solution {
public:
    vector<vector<int>>res;
    map<int,int>num;
    //通过探索所有可能解
    void add(vector<int>& nums,vector<int>&temp,int x){
        //当前解已经得出加入结果中
        if(x==nums.size()){
            res.push_back(temp);
            return;
        }
        for(int i=0;i<nums.size();i++){
            //判断当前数字是否已经加入可行解
            if(num[nums[i]]==0){
                num[nums[i]]=1;
                temp[x]=nums[i];
                add(nums,temp,x+1);
                num[nums[i]]=0;
            }
        }
        return;
    } 
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int>temp(nums.size(),0);
        add(nums,temp,0);
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


