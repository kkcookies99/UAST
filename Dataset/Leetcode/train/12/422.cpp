 class Solution {
public:
    string wei(int n,int i){//所求数字在IVXLCDM中以第i个为主
        string w="IVXLCDM";
        string str="";
        if(n==1)str+=w[i-1];
        if(n==2)str=str+w[i-1]+w[i-1];
        if(n==3)str=str+w[i-1]+w[i-1]+w[i-1];
        if(n==4)str=str+w[i-1]+w[i];
        if(n==5)str+=w[i];
        if(n==6)str=str+w[i]+w[i-1];
        if(n==7)str=str+w[i]+w[i-1]+w[i-1];
        if(n==8)str=str+w[i]+w[i-1]+w[i-1]+w[i-1];
        if(n==9)str=str+w[i-1]+w[i+1];
        return str;
    }
    string XXX(int num) {
        //3562=3000+500+60+20
        //    =MMM+D+LX+II（3  5   6   2）
        //在IVXLCDM中，个位与0-2有关（1），十位与2-4（3），百位与4-6（5），千位与6有关，
        
        string ans="";
        for(int a=num/1000;a>0;a--){
            ans+='M';
        }
        num=num%1000;
        ans+=wei(num/100,5);
        num=num%100;
        ans+=wei(num/10,3);
        num=num%10;
        ans+=wei(num,1);

        return ans;

    }
};

