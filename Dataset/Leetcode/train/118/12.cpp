 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> v;
        v.emplace_back(vector{1});
        for(int i=1;i<numRows;i++){
            vector<int> t;
            for(int j=0;j<=i;j++)
                if(j==0 || j==i)
                    t.emplace_back(1);
                else
                    t.emplace_back(v[i-1][j-1]+v[i-1][j]);
            v.emplace_back(t);
        }
        return v;
    }
};

undefined
PascalTriangleAnimated2.gif:1 Failed to load resource: net::ERR_TIMED_OUT
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


