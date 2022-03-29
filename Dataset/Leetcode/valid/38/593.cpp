 class Solution {
public:
    string XXX(int n) {
        if(n==1) return "1";
        string res, pre="1";
        for(int j=1; j<n; j++){
            res = "";
            int start=0, i=0;

            while(i<pre.size()){
                while(i<pre.size() && pre[i]==pre[start]) i++;
                res += i-start+'0';
                res += pre[start];
                start = i;
            }
            pre = res;
        }
        return res;
    }
};

