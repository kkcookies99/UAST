 class Solution {
public:
    string XXX(int num) {
       	unordered_map<int, string>roman = { {1000,"M"},{2000,"MM"},{3000,"MMM"},{100,"C"},{200,"CC"},{300,"CCC"},{10,"X"} ,{20,"XX"},{30,"XXX"},{1,"I"},{2,"II"},{3,"III"},{5,"V"},{4,"IV"},{6,"VI"},{7,"VII"},{8,"VIII"},{40,"XL"},{50,"L"},{60,"LX"},{70,"LXX"},{80,"LXXX"},{400,"CD"},{500,"D"},{600,"DC"},{700,"DCC"},{800,"DCCC"} ,
         {900,"CM"},{90,"XC"} ,{9,"IX"} };
       int kk=1,a=num;
       while(a/10){
          a/=10;
           kk*=10;
       } 
            string dis="";
       while(num){
           if(kk==0){break;}
          int now=num/kk;
         dis+=roman[kk*now]; 
          num%=kk; 
           kk/=10;
       }
return dis;
    }
};

