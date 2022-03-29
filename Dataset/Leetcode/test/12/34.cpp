 class Solution {
public:
    string XXX(int num) {
        string snum = to_string(num), ans = "";
        int n = snum.size();
        for (int i = 0; i < n; i++) {
            int dig = n - i, ndig = snum[i] - '0';
            string one = "", five = "", nine = "";
            switch (dig) {
                case 1:
                    one = "I"; five = "V"; nine = "IX"; break;
                case 2:
                    one = "X"; five = "L"; nine = "XC"; break;
                case 3:
                    one = "C"; five = "D"; nine = "CM"; break;
                case 4:
                    one = "M"; break;
            }
            if (ndig == 9)
                ans += nine;
            else if (ndig == 4)
                ans += one + five;
            else if (ndig > 4) {
                ans += five;
                for (int _ = 0; _ < ndig - 5; _++)
                    ans += one;
            }
            else 
                for (int _ = 0; _ < ndig; _++)
                    ans += one;
        }
        return ans;
    }
};

