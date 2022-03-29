 class Solution {
public:
    int XXX(string s) {
        int l=1;//实时长度
        int L=1;//最大长度
        int j=0;
        int x=0;//子串开头标记
        if(s.size()<=1)
            return s.size();    
        for(int i=1;i<=s.size()-1;i++)
            for(j=x;j<i;j++){
                if(!(s[i]==s[j])){
                    if(i==j+1){
                       l+=1;
                       L=(l>L)?l:L;    
                    }
                }
                else{
                    l=l-(j-x);
                    x=j+1;  
                    j=j+1;
                    break;
                }    
            }       
        return L;
    }
};

