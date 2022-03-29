 class Solution {
public:
    int a[20] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
    string b[20] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    string XXX(int num) {
        string ans = "";
        while(num) {
            for(int i = 12; i >= 0; i--) {
                if(num >= a[i]) {
                    num -= a[i];
                    ans += b[i];
                    break;
                }
            }
        }
        return ans;
    }
};

