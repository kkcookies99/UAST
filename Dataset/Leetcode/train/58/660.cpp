class Solution {
public:
    int XXX(string s) {
        int len = s.size();
        int res = 0;
        int end = len - 1;
        while(end>=0){
            if(s[end] == ' '){ 
                end = end -1;
            }
            else break;
        }
        s = s.substr(0,end);
        int start = end;
        while(start>=0){
            if(s[start] == ' '){
                break;
            }else start--;
        }
        res = end -start;
        return res;
    }
};

