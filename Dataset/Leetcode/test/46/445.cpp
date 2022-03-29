 class Solution {
public:
    vector<vector<int>> ans;
    vector<int> tmp;

    void change(int id ){
        //回溯结束的条件交换到最后一个数据
        if(id + 1== tmp.size()){
            ans.push_back(tmp);
            return;
        }
        //回溯的选择，本次的选择是，还没有固定下来的数，可以通过交换获得
        for(int i = id;i < tmp.size();i++){
            swap(tmp[id],tmp[i]);
            change(id + 1);
            swap(tmp[id],tmp[i]);
        }
            
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        tmp = nums;
        change(0);
        return ans;
    }
};

