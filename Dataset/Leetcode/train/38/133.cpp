class Solution {
public:
    string XXX(int n) {
        string str = "1";
        int start = 0;
        int end = str.size();
        for(int i=1; i<n; i++){
            end = str.size();
            for(int j=start+1,cnt=1; j<=end; ++j){
                if(j == end || str[j] != str[j-1]){
                    str += to_string(cnt) + str[j-1];
                    cnt = 1;
                }else ++cnt;
            }
            start = end;
        }
        return str.substr(start);
    }
};

