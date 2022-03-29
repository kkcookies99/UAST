 class Solution {
public:
    bool check(int i,stack<int> S){
        while(!S.empty()){
            if(S.top()==i) return false;
            S.pop();
        }
        return true;
    }
    vector<int> GetAns(stack<int> S,vector<int>& nums){
        vector<int> ret;
        while(!S.empty()){
            ret.emplace_back(nums[S.top()]);
            S.pop();
        }
        return ret;
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ret;
        stack<int> S;
        int N = nums.size();
        S.push(0);
        int curr = 0;
        while(!S.empty()||curr<N){
            if(check(curr,S)){
                S.push(curr);
                curr=0;
            }else{
                curr++;
            }

            if(S.size()==N){
                ret.emplace_back(GetAns(S,nums));
                curr = S.top()+1;
                S.pop();
            }

            while(curr>=N&&!S.empty()){
                curr = S.top()+1;
                S.pop();
            }
        }

        return ret;
    }
};

