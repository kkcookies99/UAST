class Solution {
public:
    int XXX(string s) {
        int val[13] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        string str[13] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i = 0,j = 0, result = 0;;
        while(s.size() > i){
            if( s.compare(i,1,str[j]) == 0 ){
                result += val[j];
                i++;
            }else if( s.compare(i,2,str[j]) == 0 ){
                result += val[j];
                i += 2;
            }else{
                j++;
            }
        }
        return result;
    }
};

