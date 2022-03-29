 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1){
            return s;
        }
        //int(s.size)
        vector<string> vec(min(int(s.size()), numRows));

        int rows = 0;
        bool flag = false;

        for(char c : s){
            vec[rows] += c;
            if(rows == 0 || rows == numRows - 1){
                flag = !flag;
            }
            rows += (flag ? 1 : -1);
        }

        string res = "";
        for(string str : vec ){
            res += str;
        }
        return res;





    }
};

