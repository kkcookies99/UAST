 class Solution {
public:
    string XXX(string s) {
        if(s=="")return "";
        string out=s.substr(0,1);
        int curMax=3;
        int len=s.length();
        for(int i=0;i<len*2;i+=2){
            s=s.insert(i,"#");
        }s.append("#");
        len=s.length();
        for(int i=2;i<len-2;i++){
            int cnt=1;
            while(i-cnt>0&&i+cnt<len-1){
                if(s[i-cnt]==s[i+cnt])cnt++;
                else {cnt--;break;}
            }
            int curLen=2*cnt+1;
            if(curLen>curMax){
                curMax=curLen;
                out=s.substr(i-cnt,curMax);
            }
        }
        int i=0;
        string end="";
        while(i<out.length()){
            char a=out[i++];
            if(a!='#'){
                char str[2]={a,'\0'};
                end.append(str);
            }
        }
        return end;
    }
};

