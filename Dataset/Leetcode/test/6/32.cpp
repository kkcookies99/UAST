 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1) return s;
        vector<string> mat(numRows);
        int p1 = 0;
        int direct = 1;
        int n = s.size();
        for(int i = 0;i<n;i++){
            mat[p1].push_back(s[i]);
            if(p1 == (numRows-1)) {
                direct = 0;
                p1--;
                continue;

            }
            if(p1 == 0){
                direct = 1;
                p1++;
                continue;
            }
            if(p1<(numRows-1)&&direct == 1) {
               p1++;
               continue;
            }
            if(p1<(numRows-1)&&direct == 0) {
                p1--;
                continue;
            }

        }
        string result;
        for(int i = 0;i<numRows;i++){
            result+=mat[i];
        }
        return result;
    }
};

