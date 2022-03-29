 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& ss) {
  
        sort(ss.begin(), ss.end(), [](vector<int>&x, vector<int>&y){
            return x[1] == y[1] ? x[0] < y[0] : x[1] < y[1];
        });

        stack<int> vis;
        vis.push(0);

        for(int i = 1; i < ss.size(); ++i){
            if(ss[i][1] == ss[vis.top()][1]) continue;

            if(ss[i][0] > ss[vis.top()][1]){
                vis.push(i);
            }else{
                while(vis.size() && ss[vis.top()][0] >= ss[i][0]) vis.pop();
                if(vis.size() && ss[vis.top()][1] >= ss[i][0]) ss[vis.top()][1] = ss[i][1];
                else vis.push(i);
            }
        }

        vector<vector<int>> res(vis.size());
        int idx = vis.size()-1;
        while(vis.size()){
            res[idx--] = ss[vis.top()];
            vis.pop();
        }

        return res;
    }
};

