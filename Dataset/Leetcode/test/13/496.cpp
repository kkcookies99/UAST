 class Solution {
public:
    int XXX(string s) {
        int n=s.size();
        int num=0;
        char b='I';
       for(int i=n-1;i>-1;i--){
           switch(s[i]){
               case 'I':if(b=='I'){num+=1;b='I';}else{num+=-1;}break;
               case 'V':num+=5;b='V';break;
               case 'X':if(b=='L'||b=='C'){num+=-10;}else{num+=10;b='X';}break;
               case 'L':num+=50;b='L';break;
               case 'C':if(b=='D'||b=='M'){num+=-100;}else{num+=100;b='C';}break;
               case 'D':num+=500;b='D';break;
               case 'M':num+=1000;b='M';break;
           }
       } 
       return num;
    }
};

