class Solution {
public:
    string XXX(string a, string b) {
        string rslt;
        int plus=0;
        int na=a.length(),nb=b.length(),i,len;
        if(na>=nb){
            b.insert(b.begin(),na-nb,'0');
            len=na;
        }
        else if(na<nb){
            a.insert(a.begin(),nb-na,'0');
            len=nb;
        }
    
        for(i=len-1;i>-1;i--){
            if(a[i]=='0' && b[i]=='0'){
                if(plus==0){
                     rslt.push_back('0');
                     plus=0;
                }
                else {
                     rslt.push_back('1');
                     plus=0;
                }
            }
            else if((a[i]=='0' && b[i]=='1')|| (a[i]=='1' && b[i]=='0') ){
                if(plus==0){
                     rslt.push_back('1');
                     plus=0;
                }
                else{
                     rslt.push_back('0');
                     plus=1;
                }
            }
            else if(a[i]=='1' && b[i]=='1'){
                if(plus==0){
                    rslt.push_back('0');
                    plus=1;
                }
                else{
                    rslt.push_back('1');
                    plus=1;
                }                 
            }
        }
        if(plus==1&&i==-1){
            rslt.push_back('1');
        }
        
        reverse(rslt.begin(),rslt.end());
        return rslt;

    }

};

