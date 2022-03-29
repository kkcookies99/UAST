 class Solution {
public:
    string XXX(int num) {
        if(num == 0) return "";
        if(num >= 1000) {
            return "M" + XXX(num-1000);
        }else if(num >= 900) {
            return "CM" + XXX(num-900);
        }else if(num >= 500) {
            return "D" + XXX(num-500);
        }else if(num >= 400) {
            return "CD" + XXX(num-400);
        }else if(num >= 100) {
            return "C" + XXX(num-100);
        }else if(num >= 90) {
            return "XC" + XXX(num-90);
        }else if(num >= 50) {
            return "L" + XXX(num-50);
        }else if(num >= 40) {
            return "XL" + XXX(num-40);
        }else if(num >= 10) {
            return "X" + XXX(num-10);
        }else if(num >= 9) {
            return "IX" + XXX(num-9);
        }else if(num >= 5) {
            return "V" + XXX(num-5);
        }else if(num >= 4) {
            return "IV" + XXX(num-4);
        }else {
            return "I" + XXX(num-1);
        }
    }
};

