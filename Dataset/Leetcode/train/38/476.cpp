 class Solution {
public:
    string res = "11";
    int count = 2;
    string XXX(int n) {
        if(n==1)
            return "1";
        countNum(count,n);
        return res;
    }
    void countNum(int count,int n){
        if(n==count)
            return;
        string tmp;
        int sum = 1;
        for(int i=1;i<res.size();i++){
            if(res[i]!=res[i-1]){
                tmp += to_string(sum) + res[i-1];
                sum = 1;
            }
            else
                sum++;
        }
        tmp += to_string(sum) + res[res.size()-1];
        res = tmp;
        countNum(count+1,n);
    }
};

