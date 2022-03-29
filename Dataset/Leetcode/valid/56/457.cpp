 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& inter) {
        vector<vector<int>>res;
        if(inter.size() == 1){
            res.push_back({inter[0][0],inter[0][1]});
            return res;
        }

        sort(inter.begin(),inter.end(),[](vector<int>&a,vector<int>&b){
            return a[0]<b[0]||a[0]==b[0]&&a[1]<b[1];
        });
        
        for(int i = 1; i < inter.size(); i++){
            if(inter[i][0] == inter[i - 1][0]){
                inter[i][1] = max(inter[i][1],inter[i-1][1]);
                inter.erase(inter.begin() + i -1);
                i--;
            }else if(inter[i][0] <= inter[i - 1][1]){
                inter[i][0] = inter[i - 1][0];
                inter[i][1] = max(inter[i][1],inter[i-1][1]);
                inter.erase(inter.begin() + i -1);
                i--;
            }
        }
        return inter;
    }
};

