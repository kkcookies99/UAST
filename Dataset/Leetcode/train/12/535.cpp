 class Solution {
public:
    int values[13]={1000,900,500, 400, 100, 90, 50,  40, 10,  9,   5,  4,   1};
    string roam[13]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    string result="";
    
    string XXX(int num) {
        for(int i=0; i<13; i++){
            while(num >= values[i]){
                num -= values[i];
                result += roam[i];
            }
        }
        return result;
    }
};

