 class Solution {
public:
    bool ischeck(char a,char b){
        if((a=='('&&b==')')||(a=='['&&b==']')||(a=='{'&&b=='}')){
            return true;
        }
        else{return false;}
    }
    bool XXX(string s) {
        int newsize=-1;
        for(int i=0;i<s.size();i++){
            s[++newsize]=s[i];
            if(newsize>0&&ischeck(s[newsize-1],s[newsize])){
                newsize-=2;
            }
        }
        if(newsize==-1){
            return true;
        }
        else{
            return false;
        }
    }
};

