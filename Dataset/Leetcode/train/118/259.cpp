 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> vv;
        vector<int> v;
        int sum = 1, temp = 0;

        for (int i=1; i<=numRows; i++) {
            
            if (i > 2) 
                for (int j=1; j<i-1; j++) {
                    temp = v[j];
                    sum = temp + sum;
                    v[j] = sum;
                    sum = temp;
                }

            v.resize(i, 1);
            vv.push_back(v);
        }      

        return vv;
    }
};

