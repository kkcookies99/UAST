 class Solution {
public:
    string XXX(string a, string b) {
        string res(max(a.size(),b.size())+1,'0');
        for(int i=res.size()-1;i>0;i--){
            if( i >= res.size()-min(a.size(),b.size())) {       //两个字符串都存在
                res[i] += a[i-res.size()+a.size()]-'0' + b[i-res.size()+b.size()]-'0';
                if (res[i] > '1') {
                    res[i-1]++;
                    res[i]='0'+(res[i]-'0')%2;
                }
            }
            else {
                if(a.size() > b.size() ){                       //只剩下a
                    res[i] += a[i-res.size()+a.size()]-'0';
                    if (res[i] > '1') {
                        res[i-1]++;
                        res[i]='0'+(res[i]-'0')%2;
                    }
                }
                else {                                //只剩下b
                    res[i] += b[i-res.size()+b.size()]-'0';
                    if (res[i] > '1') {
                        res[i-1]++;
                        res[i]='0'+(res[i]-'0')%2;
                    }
                }  
            }

        }
        if (res[0]=='0') return res.substr(1);
        return res;
    }
};

