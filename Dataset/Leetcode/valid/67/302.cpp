 class Solution {
public:
    string XXX(string a, string b) {
        string bigStr = a.length() > b.length() ? a : b;
        string smallStr = a.length() > b.length() ? b : a;
        int    i        = smallStr.length() - 1;
        int    j        = bigStr.length() - 1;
        int    flag     = 0;
        string ans = "";
        while(i >= 0 && j >=0) {
            int sum = smallStr[i] - '0' + bigStr[j] - '0' + flag;
            if(sum == 3) {
                ans += "1";
                flag = 1;
            } else if(sum == 2) {
                ans += "0";
                flag = 1;
            } else {
                ans += to_string(sum);
                flag = 0;
            }
            i--;
            j--;
        }
        string diff = bigStr.substr(0, bigStr.length() - smallStr.length());
        j = diff.length() - 1;
        while (j >= 0) {
            int sum = diff[j] - '0' + flag;
            if(sum == 2) {
                ans += "0";
                flag = 1;
            } else {
                ans += to_string(sum);
                flag = 0;
            }
            j--;
        }
        if(flag == 1) {
            ans += to_string(flag);
        }
        reverse(ans.begin(), ans.end());
        return ans;
    }
};

