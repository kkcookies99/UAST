 class Solution {
public:
/*
0         / 2n-2       /  4n-4
1    2n-3   2n-1   4n-5   4n-3
     /       |    /        |
n-2  n      3n-4 /3n-2     |
n-1/        3n-3/         5n-5
j为等处理的字符串的下标，上图为对应下标字符按z字排后的样子，
假设i为行（即从0到n-1），k为某一行的列下标，比如0对应k==0, 2n-2对应k==1，
以行0为例（0, 2n-2,4n-4）等下标j都是2n-2的倍数,其对应下标为j=k*(2n-2)，因为此时的i==0，也就是说k*(2n-2)+i或k*(2n-2)-i都为2n-2的倍数也就是j+i或j-i为2n-2的倍数;
最后一行i对应下标j为 k*(2n-2)+(n-1)，j转换成k*(2n-2)+i比如3n-3==1*(2n-2)-(n-1)==j==k*(2n-2)+i，那么j-i==k*(2n-2),也就是j-i是2n-2的倍数;
中间的行（1到n-2）, 其值与 列*(2n-2)也是有规律的，比如j为2n-3时，行i==1， j+i==2n-3+1==2n-2是k*(2n-2)，表示j+i为2n-2的倍数，另外比如2n-1时j-i=2n-1-1==2n-2是却是表明j-i为2n-2的倍数。
总结一下，首行及尾行满足j-i为2n-2的倍数，中间行满足要么j-i为2n-2的倍数要么j+i为2n-2的倍数。

每
*/
    string XXX(string s, int numRows) {
        if (numRows <= 1)
            return s;
        string ret;
        int columnAdd = 2*numRows - 2; // 首行每个间隔为2n-2, 尾行也是如此

        // i为行，j为字符在s中的下标
        for (int i = 0; i < numRows; ++i) {
            for (int j = 0; j < s.size(); ++j) {
                if (i == 0 || i == numRows-1) {
                    if ((j - i) % columnAdd == 0) {
                        ret += s[j]; // 首行及尾行满足j-i为2n-2的倍数
                    }
                } else {
                    // 中间行满足j+i是2n-2的倍数，或者j-i是2n-2的倍数
                    if (((j + i) % columnAdd == 0) || ((j - i) % columnAdd == 0)) {
                        ret += s[j];
                    }
                }
            }
        }

        return ret;
    }
};

