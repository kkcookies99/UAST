 class Solution {
public:
    string XXX(string a, string b) {
        string res="0";
        while(1){
            if(a==""&&b==""){
                break;
            }
            char x,y,z;
            z=res[0];
            if(a!=""){
                x=a[a.size()-1];
                a.pop_back();
            }
            else{
                x='0';
                
            }
            if(b!=""){
                y=b[b.size()-1];
                b.pop_back();         
            }
            else{
                y='0';
            }
            
            if((x+y+z-3*'0')<2){
                res[0]=x+y+z-2*'0';
                res.insert(0,1,'0');
                
            }
            else if((x+y+z-3*'0')==2){
                res[0]='0';
                res.insert(0,1,'1');
                
            }
            else if((x+y+z-3*'0')==3){
                res[0]='1';
                res.insert(0,1,'1');
            }
        }
        if(res[0]=='0'){
            res.erase(0,1);
        }
        return res;
    }
};

