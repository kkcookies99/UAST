 class Solution {
public:
    string XXX(string s, int numRows) {
        string result;
        if (s.size() <= 1 || numRows == 1) {
            return s;
        }
        vector<string> strArray(numRows);
        
        // 行数
        int row = 0;
        // 掉头
        int flag = 1;
        // 
        int len = 2 * numRows - 2;
        for (int i = 0; i < s.size(); i++) {
            strArray[row].push_back(s[i]);
            // 到达最后一行，向上掉头
            if (row % len == numRows - 1) {
                flag = -1;
            } else if (row % len == 0){
                // 到达第一行，向下走
                flag = 1;
            }
            row += flag;
        }
        for (int i = 0; i < numRows; i++) { 
            result += strArray[i];
        }
        return result;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


