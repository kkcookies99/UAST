 class Solution {
public:
    bool XXX(string s) {
        if(s.length() == 0) return true;
        int i = 0, j = s.length()-1; //头尾双指针
        while(i<j)
        {
            int iAscii = (int)s[i], jAscii = (int)s[j];;
            if(iAscii<48 || (57<iAscii&&iAscii<65) || (90<iAscii&&iAscii<97) || iAscii>122)
            {
                i++;
                continue;
            }
            if(jAscii<48 || (57<jAscii&&jAscii<65) || (90<jAscii&&jAscii<97) || jAscii>122)
            {
                j--;
                continue;
            }
            if((iAscii!=jAscii)&&(iAscii+32!=jAscii)&&(iAscii-32!=jAscii) || //如果是字符
            (((iAscii>47 && iAscii<58) || (jAscii>47 && jAscii<58)) && (iAscii!=jAscii))) //如果是数字
                return false;
            i++;
            j--;
        }
        return true;
    }
};

