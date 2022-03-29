 class Solution {
public:
    string XXX(string s, int numRows) {

        if (numRows == 1) return s;

        string result;
        int n = s.size();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                result+= s[j + i];
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    result += s[j + cycleLen - i];
            }
        }
        return result;
    }
};

/*找规律*/
//0       n+(n-2)     
//1 n     n+(n-1)   (n-1)+(2n-2)+1
//.   n+1  .
//.     .  .
//n-1     n+(n-2)+n-1

//第0行 (2n-2)*k k>=0
//第n-1行  n-1 + （2n-2)*k
//0<i<n-1  (2n-2)*k +i 和中间的 (2n-2)*k +i   +(2n-2)-i

