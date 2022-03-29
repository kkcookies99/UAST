 class Solution {
public:
    string XXX(int num) {
        // 从右向左依次转换
        char alp[7] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int val[7] = {1, 5, 10, 50, 100, 500, 1000};
        int _char = 6;
        string ans = "";
        while (num){
            if (num >= val[_char]){
                while (num >= val[_char]){
                    ans += alp[_char];
                    num -= val[_char];
                }
            }else{
                if (num >= int(0.9 * val[_char])){
                    ans = ans + alp[_char-2] + alp[_char];
                    num -= int(0.9 * val[_char]);
                }else if (num >= int(0.5 * val[_char])){
                    ans += alp[_char-1];
                    num -= int(0.5 * val[_char]);
                }else if (num >= int(0.4 * val[_char])){
                    ans = ans + alp[_char-2] + alp[_char-1];
                    num -= int(0.4 * val[_char]);
                }
                _char -= 2;
            }
        }

        return ans;
    }
};

