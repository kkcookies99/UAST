 class Solution {
public:
    string XXX(int num) {
        string str;
        string table="MDCLXVI";
        int r=num;
        int i=1000,ind=0;
        while(r>0){
            int x=r/i;
            if(x<4){
                str.append(x,table[ind]);
            }
            else if(x==4){
                str.append(1,table[ind]);
                str.append(1,table[ind-1]);
            }
            else if(x<9){
                str.append(1,table[ind-1]);
                str.append(x-5,table[ind]);
            }
            else{
                str.append(1,table[ind]);
                str.append(1,table[ind-2]);
            }
            r=r%i;
            i/=10;
            ind+=2;
        }
        return str;
    }
};

