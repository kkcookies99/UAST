 class Solution {
public:
    int XXX(int x) {
        const int MAX_INT = (1<<31) - 1;
        const int MIN_INT = -(1<<31);
        int result = 0;
        bool is_pos = true;
        if (x < 0) {
            is_pos = false;
        }
        while(x) {
            if (MIN_INT/10 > result 
                || (MIN_INT/10 == result && MIN_INT % 10 >= x % 10) ) {
                return 0;
            }
            result = result * 10 - abs(x % 10);
            x /= 10;
        }
        return is_pos ? -result:result;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


