 class Solution {
public:
    string XXX(int num) {
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        string letters[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        string ans="";
        for(int i=0;i<13;i++){
            while(num>=values[i]){
                ans+=letters[i];
                num-=values[i];
            }
        }
        return ans;
    }
};

