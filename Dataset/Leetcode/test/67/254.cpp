 class Solution {
public:
    string XXX(string a, string b) {
        int al = a.length();
        int bl = b.length();

        //补齐string，使两个string等长
        while (al - bl) {
            if (al < bl) {
                a = '0' + a;
                al++;
            }
            else {
                b = '0' + b;
                bl++;
            }
        }

        //往前遍历string，相加等于2进1
        for (int i=al-1; i>0; i--) {
            a[i] = a[i] - '0' + b[i];
            
            if (a[i] > '1') {
                a[i] = (a[i] - '0') % 2 + '0';
                a[i - 1] = a[i - 1] + 1;
            }
        }

        //单独计算a[0]+b[0]
        a[0] = a[0] - '0' + b[0];
        if (a[0] > '1') {
            a[0] = (a[0] - '0') % 2 + '0';
            a = '1' + a;
        }
            
        return a;
    }
};

