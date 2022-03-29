 class Solution {
public:
    int XXX(string s) {
        int res,count = 0;
        string str;//当前子字符串
        for(auto c:s){
            if(str.find(c)==string::npos){
                str += c;
                count++;
                continue;
            }
            else {
                res = count>res? count:res;
                count = 0;
                str = "";
                str += c;
            }
        }
        return res;
    }
};

