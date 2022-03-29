class Solution {
public:
    string XXX(string a, string b) {
        int len1 = a.size();
        int len2 = b.size();
        string res = "";
        if(len1 < len2){
            for(int i = 0; i < len2-len1; i++)
                a = '0' + a;
        }
        else{
            for(int i = 0; i < len1-len2; i++)
                b = '0' + b;
        }
        reverse(a.begin(),a.end());
        reverse(b.begin(),b.end());
        int len = a.size();
        int cf = 0;
        int temp = 0;
        for(int i = 0; i < a.size(); i++){
            temp = a[i] - '0' + b[i] - '0' + cf;
            cf = temp/2;
            temp = temp%2;
            res += (char)(temp+'0');
        }
        if(cf == 1){
            res += '1';
        }
        reverse(res.begin(),res.end());
        return res;
    }
};

