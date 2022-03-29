 class Solution {
public:
    string XXX(int num) {
        int ge = num % 10;
        int shi = (num / 10) % 10;
        int bai = (num / 100) % 10;
        int qian = (num / 1000) % 10;

        return (
            romanForDigit(qian, "M", "", "") +
            romanForDigit(bai, "C", "D", "M") +
            romanForDigit(shi, "X", "L", "C") +
            romanForDigit(ge, "I", "V", "X")
        );
    }

    string romanForDigit(int digit, string chLow, string chMid, string chUp) {
        if(digit == 0) return "";
        if(digit == 1) return chLow;
        if(digit == 2) return chLow + chLow;
        if(digit == 3) return chLow + chLow + chLow;
        if(digit == 4) return chLow + chMid;
        if(digit == 5) return chMid;
        if(digit == 6) return chMid + chLow;
        if(digit == 7) return chMid + chLow + chLow;
        if(digit == 8) return chMid + chLow + chLow + chLow;
        if(digit == 9) return chLow + chUp;

        return "";
    }
};


