 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> vecRes;
        vector<int> veca, vecb;
        veca.push_back(1);
        for(int i = 0; i < numRows; i++) {
            vecRes.push_back(veca);
            for(int j = 0; j < veca.size(); j++) {
                if(j == 0) {
                    vecb.push_back(veca[j]);
                } else {
                    vecb.push_back(veca[j]+veca[j-1]);
                }
            }
            vecb.push_back(1);
            veca.swap(vecb);
            vecb.clear();
        }
        return vecRes;
    }
};

