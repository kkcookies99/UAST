class Solution {
public:
    string XXX(string a, string b) {
        string ret;
        int t=0;//进位
        int x;
        int N1=a.size();int N2=b.size();
        int i=N1-1;int j=N2-1;
        while(i>-1&&j>-1){
            x=(t+a[i]+b[j]-'0'-'0')%2;
            t=(t+a[i]+b[j]-'0'-'0')/2;
            ret.push_back(x+'0');
            --i;--j;
        }
        while(i>-1){
            x=(t+a[i]-'0')%2;
            t=(t+a[i]-'0')/2;
            ret.push_back(x+'0');
            --i;
        }
        while(j>-1){
            x=(t+b[j]-'0')%2;
            t=(t+b[j]-'0')/2;
            ret.push_back(x+'0');
            --j;
        }
        if(t){
            ret.push_back(t+'0');
        }
        int N=ret.size();char temp;
        for(int i=0;i<N/2;++i){
            temp=ret[i];
            ret[i]=ret[N-1-i];
            ret[N-1-i]=temp;
        }
        return ret;
    }
};

