 class Solution {
public:
    bool XXX(int x) {
        if(x<0)return false;
        
        int opp=0,temp=x;
        while(temp!=0){
            if((opp>(pow(2,31)-1)/10)||(opp<-pow(2,31)/10)) return false;
            opp=opp*10+temp%10;
            temp/=10;
        }
        if(x==opp)return true;
        return false;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


