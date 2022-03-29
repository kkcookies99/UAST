 class Solution {
public:
    string XXX(string s, int numRows) {
        string res;
        if(s.empty() || numRows < 1) return res;
        if(numRows == 1) return s;
        vector<vector<char>> r (numRows,vector<char>(1000,' '));
        
        int lx[2]={1,-1},ly[2]={0,1};
        int n = s.size();
        int x = 0, y = 0;
        int count = 0, j = 0;
        bool b = true;
        for(int i = 0; i < n; i++){
            r[x][y] = s[i];
            x += lx[j];
            y += ly[j];
            count++;
            if(count%(numRows-1)==0){
                b = !b;
                if(b)j = 0;
                else j = 1;
            }
        }
        for(int i = 0;i<numRows;i++){
            for(int j = 0;j<=y;j++){
                if(r[i][j]!=' ')res+=r[i][j];
            }
        }    
        return res;
    }
};

