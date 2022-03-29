 class Solution {
public:
    string XXX(int num) {
        string roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int nums[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        string res;
        for (int i = 0; i < 13; i++)
            while (num >= nums[i])
            {
                res += roman[i];
                num -= nums[i];
            }
        return res;

    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


