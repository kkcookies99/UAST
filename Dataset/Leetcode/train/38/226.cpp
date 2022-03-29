class Solution {
public:
    string XXX(int n) {
        string str;
        function<void(int)> func = [&](int nIndex){
            if (nIndex >= n) {
                return;
            }
            if (nIndex == 0) {
                str = "1";
            }
            else {
                int nSize = str.size();
                string ret;
                int nCount = 0;
                char ch = '\0';
                for (int i = 0; i < nSize; i++) {
                    if (ch == '\0') {
                        ch = str[i];
                        nCount = 1;
                    }
                    else if (ch != str[i]) {
                        ret.push_back(nCount + '0');
                        ret.push_back(ch);
                        ch = str[i];
                        nCount = 1;
                    }
                    else {
                        nCount++;
                    }
                }
                if (nCount > 0) {
                    ret.push_back(nCount + '0');
                    ret.push_back(ch);
                }
                str = ret;
            }
            func(nIndex + 1);
        };

        func(0);
        return str;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


