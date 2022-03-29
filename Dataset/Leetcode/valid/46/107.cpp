class Solution {
private:
    vector<int> vec;
    vector<vector<int>> ans;
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size()==0)return ans;
        func(nums);
        return ans;
    }
    void func(vector<int> nums){
        if(nums.size()==1){
            vec.push_back(nums.front());
            ans.push_back(vec);
            vec.pop_back();
        }
        else{
            for(int i = 0;i<nums.size();i++){
                vec.push_back(*(nums.begin()+i));//1. 加入第i个元素
                nums.erase(nums.begin()+i);//2. 删除加入的元素
                func(nums);
                nums.insert(nums.begin()+i,vec.back());//3. 插入2.删除的元素
                vec.pop_back();//4.删除vec的最后元素
            }
        }
    }
};

