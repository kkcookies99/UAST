 class Solution {
public:
    string XXX(int num) {
        string res="";
            while(num/1000)
                res+='M',num-=1000;
            while(num/900)
                res+="CM",num-=900;
            while(num/500)
                res+='D',num-=500;
            while(num/400)
                res+="CD",num-=400;
            while(num/100)
                res+="C",num-=100;
            while(num/90)
                res+="XC",num-=90;
            while(num/50)
                res+='L',num-=50;
            while(num/40)
                res+="XL",num-=40;
            while(num/10)
                res+='X',num-=10;
            while(num/9)
                res+="IX",num-=9;
            while(num/5)
                res+='V',num-=5;
            while(num/4)
                res+="IV",num-=4;
            while(num)
                res+='I',num--;
        return res;
    }
};

