 class Solution {
public:
    string XXX(string a, string b) {
        int m = a.size(), n= b.size();
        string c="";
        int carry =0, i=m-1, j= n-1;
        while(i >=0 || j >=0 || carry){
            char tmp1 = i>=0 ? a[i] :'0';
            char tmp2 = j>=0 ? b[j] :'0';
            int tmp = (tmp1 -'0') + (tmp2 -'0') +carry;
            if(tmp >=2){
                tmp = tmp %2;
                carry =1;
            }
            else
                carry =0;
            c.insert(c.begin(), char(tmp +'0'));
            i--, j--;
        }
        return c;
    }
};

