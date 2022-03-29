class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        vector<int> ans;
        for(int i=digits.size()-1;i>=0;i--){
            ans.push_back(digits[i]);
        }
        ans[0]++;
        for(int i=0;i<ans.size()-1;i++){
            if(ans[i]==10){
                ans[i+1]++;
                ans[i]=0;
            }
        }
        if(ans[ans.size()-1]==10){
            ans[ans.size()-1]=0;
            ans.push_back(1);
        }
        vector<int>a;
        for(int i=ans.size()-1;i>=0;i--){
            a.push_back(ans[i]);
        }

        return a;
    }
};

