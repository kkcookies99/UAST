class Solution {
public:
    int XXX(string s) {
        int n=s.length();
        int f=-1,i=0,res=0;
        do{
            f=s.find(" ",i);
            if(f==-1){
                res=n-i;
            }else{
                if(f-i!=0){
                    res=f-i;
                    i=f+1;
                }else{
                    i=f+1;
                }
            }
        }while(f!=-1&&i<n);
        return res;
    }
};

