 class Solution {
public:
    string XXX(string s, int numRows) {

        string res;
        int len = s.size();

        if (numRows == 1) {
            res = s;
            return res;
        }

        //遍历行
        //每行前进的规律是先往前跳jump1 ，再往前跳jump2，循环进行
        int r = 1;

        while (r <= numRows) {
            int i = r-1;
            int jump1 = (numRows - r) * 2;
            int jump2 = r - 2 + r;
            int count = 1;

            while (i < len) {
                res += s[i];
                
                if (count++%2) {
                    if (jump1) {i += jump1;}
                    else {i += jump2;}
                    
                }
                else {
                    if (jump2) {i += jump2;}
                    else {i += jump1;}
                }

            }

            r++;

        }

        return res;

    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


