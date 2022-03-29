 class Solution {
public:
    string XXX(int num) {
       int n=1000;
       string res;
       map<int,string> mymap;
       mymap.insert(make_pair(1,"I"));
       mymap.insert(make_pair(5,"V"));
       mymap.insert(make_pair(10,"X"));
       mymap.insert(make_pair(50,"L"));
       mymap.insert(make_pair(100,"C"));
       mymap.insert(make_pair(500,"D"));
       mymap.insert(make_pair(1000,"M"));
       while(n>0){
           int temp=num/n;
           if(temp){
               if(temp>=5){
                   if(temp==9){
                       res+=(mymap[n]+mymap[n*10]);
                   }
                   else{
                        res+=mymap[n*5];
                        temp-=5;
                        for(int i=0;i<temp;i++) res+=mymap[n];
                    }
                }
               else if(temp==4){
                   res+=(mymap[n]+mymap[n*5]);
                }
               else{
                string tempstr;
                for(int i=0;i<temp;i++) tempstr+=mymap[n];
                res+=tempstr;
               }
           }
           num=num%n;
           n/=10;
       }
       return res; 
    }
};

