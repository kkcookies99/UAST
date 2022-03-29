 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        deque<int> dq;
        for(int i=0;i<nums.size();i++) dq.push_back(nums[i]);
        help(dq,vector<int>{});
        return result;
    }

private:
    vector<vector<int>> result;
    void help(deque<int> left,vector<int> choose){
        if(left.size()==0){
            result.push_back(choose);
            return;
        }
        for(int i=0;i<left.size();i++){
            int temp=left[0];
            left.pop_front();
            choose.push_back(temp);
            help(left,choose);
            left.push_back(temp);
            choose.pop_back();
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


