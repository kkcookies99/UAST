 class Solution {
public:
    string XXX(int num) {
        if(num==0 || num>3999)
           return "error";
        string str[][9]={{"I","II","III","IV","V","VI","VII","VIII","IX"},
        {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
        {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
        {"M","MM","MMM"}};
        int i=0;
        string result;
        int a;
        while(num!=0)
        {
            if(num%10)
            {
                a=num%10;
               result=str[i][a-1]+result;
            }
          i++;
          num=num/10;
        }
        return result;
    }
};

