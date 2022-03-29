 class Solution {
public:
    string XXX(int num) {
        string s;
        int n = 0;
        if(num<0||num>5000)  return s;
        n = num/1000;
        s.append(n,'M');
        num-=n*1000;
        n=num/100;
        if(n<=3) s.append(n,'C');
        else if(n==4) s.append("CD");
        else if(n==5) s.append("D");
        else if(n==9) s.append("CM");
        else if(n>5){
            s.append("D");
            s.append(n-5,'C');
        } 
        
        num-=n*100;
        n=num/10;
        if(n<=3) s.append(n,'X');
        else if(n==4) s.append("XL");
        else if(n==5) s.append("L");
        else if(n==9) s.append("XC");
        else if(n>5){
            s.append("L");
            s.append(n-5,'X');
        } 
        
        num-=n*10;
        n=num;
        if(n<=3) s.append(n,'I');
        else if(n==4) s.append("IV");
        else if(n==5) s.append("V");
        else if(n==9) s.append("IX");
        else if(n>5){
            s.append("V");
            s.append(n-5,'I');
        } 
        
        return s;
    }
};

