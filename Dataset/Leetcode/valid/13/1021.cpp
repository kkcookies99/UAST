 class Solution {
public:
    int XXX(string s) {
        int buffer = 0, result = 0;     // buffer用于临时存各个字母代表的值（带正负的）
        bool minus = false;     // minus = true时，这个元素需要减，否则就加

        // 从后往前循环整个字符串
        // 如果正向循环，对于IV，IXCM这种组合，会先遇到I，这样可能要判断后面的一些字母才能处理当前字母
        // 反向则可以无脑做加法，处理每个字母的时候，都能顺便判断前一个字母是要做加法还是减法
        // 比如IXCM，遇到M加5000的同时可以知道下一个C需要减，处理C的-100时又会知道下一个X需要减 ...
        for (int i = s.length()-1; i >= 0; i --){
            buffer = minus ? -1 : 1;    // 先把正负处理好，不然下面要多一些很碍眼的判断
            minus = false;  // 重置一下minus

            switch (s[i]){
                case 'M':
                    buffer *= 1000;     // 赋值，这时buffer已经是这次需要加的值了，当前字母处理完毕
                    minus = (i != 0) && s[i-1] == 'C';  // 判断前面的一个字母是需要加还是减
                    break;
                case 'D':
                    buffer *= 500;
                    minus = (i != 0) && s[i-1] == 'C';
                    break;
                case 'C':
                    buffer *= 100;
                    minus = (i != 0) && s[i-1] == 'X';
                    break;
                case 'L':
                    buffer *= 50;
                    minus = (i != 0) && s[i-1] == 'X';
                    break;
                case 'X':
                    buffer *= 10;
                    minus = (i != 0) && s[i-1] == 'I';
                    break;
                case 'V':
                    buffer *= 5;
                    minus = (i != 0) && s[i-1] == 'I';
                    break;
                default:
                    break;  // 这里其实是I，但buffer已经对了，不用再变，I前面肯定是加，minus也不变
            }
            result += buffer;
            buffer = 0; // 重置buffer
        }
        return result;
    }
};

