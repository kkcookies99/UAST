 class Solution {
public:
    string XXX(int num) {
        string cur, res = "";
        int val, k;
        vector<string> roman{"I", "V", "X", "L", "C", "D", "M"};
        for (k = 0; num > 0; num /= 10, k += 2)
        {
            cur = "";
            val = num % 10;
            if (val == 4)
                cur.append(roman[k]).append(roman[k+1]);
            else if (val == 9)
                cur.append(roman[k]).append(roman[k+2]);
            else 
            {
                if (val >= 5)
                    cur.append(roman[k+1]);
                val %= 5;
                while ((val--) > 0)
                {
                    cur.append(roman[k]);
                }
            }
            res = cur.append(res);
        }
        return res;
    }
};

