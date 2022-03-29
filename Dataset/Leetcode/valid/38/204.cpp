class Solution {
public:
    string XXX(int n) {
        //找规律  发现没啥规律 老老实实走吧
        //n=1 1
        //n=2 11
        //n=3 21
        //n=4 1211
        //n=5 111221
        //n=6 312211
        //n=7 13112221
        //n=8 1113213211
        if(n<=0) {
            return "";
        }
        else if(n==1) {
            return "1";
        }
        string tmp;
        string res="1";
        for(int i = 1; i<n; i++){
            tmp = res;
            res = "";
            for(int j = 0; j<tmp.length();){
                int count = 0;
                int k = j;
                while(tmp[j]==tmp[k] && k<tmp.length()){
                    k++;
                    count++;
                }
                res += to_string(count) + tmp[j];
                j = k;
            }
        }
        return res;

    }
};

