 class Solution {
public:
    vector<vector<int>> XXX(int n) {
        vector<vector<int>>f;
        for(int i=0;i<n;i++){
            vector<int>line(i+1);
            //首和尾为1
            line[0]=line[i]=1;
            for(int j=1;j<i;j++){
                line[j]=f[i-1][j-1]+f[i-1][j];
            }
            f.push_back(line);
        }
        return f;
    }
};

