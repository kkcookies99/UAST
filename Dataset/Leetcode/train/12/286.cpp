 class Solution {
private:
    int tab[13]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
    string ch[13]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
public:
    string XXX(int num) {
        string ans="";
        int time,i;
        for(i=12;i>=0;i--){
            time=num/tab[i];
            if(time==0) continue;
            else{
                while(time--){
                    ans+=ch[i];
                    num-=tab[i];
                }
            }
        }
        return ans;
    }
};

