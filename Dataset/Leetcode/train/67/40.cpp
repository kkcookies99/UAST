 class Solution {
public:
    string XXX(string a, string b) {
        int alen=a.size(),blen=b.size(),c=0;
        string result="";
        while(alen&&blen){
            if(a[alen-1]=='1' && b[blen-1]=='1' && !c){  //1 1 0
                result+="0";
                c=1;
            }
            else if(a[alen-1]=='1' && b[blen-1]=='1' && c){  //1 1 1
                result+="1";
                c=1;
            }
            else if((a[alen-1]-'0' || b[blen-1]-'0') && !c){  //1 0 0
                result+="1";
                c=0;
            }
            else if((a[alen-1]-'0' || b[blen-1]-'0') && c){  //1 0 1
                result+="0";
                c=1;
            }
            else if(a[alen-1]=='0' && b[blen-1]=='0' && !c){  //0 0 0
                result+="0";
                c=0;
            }
            else if(a[alen-1]=='0' && b[blen-1]=='0' && c){  //0 0 1
                result+="1";
                c=0;
            }
            alen--;
            blen--;
        }
        while(alen){
            if(a[alen-1]=='1' && c){  //1 1 
                result+="0";
                c=1;
            }
            else if(a[alen-1]-'0' || c){  //0 1    1 0
                result+="1";
                c=0;
            }
            else if(a[alen-1]=='0' && !c){  //0 0
                result+="0";
                c=0;
            }
            alen--;
        }
        while(blen){
            if(b[blen-1]=='1' && c){  //1 1 
                result+="0";
                c=1;
            }
            else if(b[blen-1]-'0' || c){  //0 1    1 0
                result+="1";
                c=0;
            }
            else if(b[blen-1]=='0' && !c){  //0 0
                result+="0";
                c=0;
            }
            blen--;
        }
        if(c)
            result+="1";
        reverse(result.begin(),result.end());
        return result;
    }
};

