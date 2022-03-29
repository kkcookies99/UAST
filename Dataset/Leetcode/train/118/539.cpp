 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;
        for(int i = 1; i <= numRows; i++){
            vector<int> t(i);

                for(int j = 0; j<i; j++){
                    int temp;
                    if(j == 0 || j == i-1)
                        temp = 1;
                    else{
                        temp = res[i-2][j-1] + res[i-2][j];
                    }
                    t[j] = temp;
                }
            
            res.push_back(t);
        }
        return res;
    }
};

