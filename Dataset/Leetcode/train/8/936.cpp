 class Solution {
public:
    int XXX(string str) {
        int maxx=(1<<31)-1; int minn=-1*(1<<31);
        int fu=1,start=0;
        long long res=0;
        for(int i=0;i<str.size();++i){
            if(start==0){
                if(str[i]=='-') {fu=-1; start=1; continue;}
                else if(str[i]=='+') {fu=1; start=1; continue;}
                else if(str[i]>='0'&&str[i]<='9') start=1;
                else if(str[i]==' ') continue;
                else break;
            }else if(start==1){
                if(str[i]<'0'||str[i]>'9') break;
            }
            res=res*10+(str[i]-'0');
            long long t=res*fu;
            if(t<minn) return minn;
            else if(t>maxx) return maxx; 
        }   
        return fu*res;
    }
};

