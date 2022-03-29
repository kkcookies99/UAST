 class Solution {
public:
    string XXX(int num) {
        char ret[20] = "";
        if(num < 1 || num > 3999)
            return string(ret);
        int i = 0;
        if(num >= 1000)
        {
            int tmp = num / 1000;
            while(tmp-- > 0)
                ret[i++] = 'M';
            num %= 1000;
        }
        if(num >= 900)
        {
            ret[i++] = 'C';
            ret[i++] = 'M';
            num -= 900;
        }
        if(num >= 500)
        {
            ret[i++] = 'D';
            num -= 500;
        }
        if(num >= 400)
        {
            ret[i++] = 'C';
            ret[i++] = 'D';
            num -= 400;
        }
        if(num >= 100)
        {
            int tmp = num / 100;
            while(tmp-- > 0)
                ret[i++] = 'C';
            num %= 100;
        }
        if(num >= 90)
        {
            ret[i++] = 'X';
            ret[i++] = 'C';
            num -= 90;
        }
        if(num >= 50)
        {
            ret[i++] = 'L';
            num -= 50;
        }
        if(num >= 40)
        {
            ret[i++] = 'X';
            ret[i++] = 'L';
            num -= 40;
        }
        if(num >= 10)
        {
            int tmp = num / 10;
            while(tmp-- > 0)
                ret[i++] = 'X';
            num %= 10;
        }
        if(num >= 9)
        {
            ret[i++] = 'I';
            ret[i++] = 'X';
            num -= 9;
        }
        if(num >= 5)
        {
            ret[i++] = 'V';
            num -= 5;
        }
        if(num >= 4)
        {
            ret[i++] = 'I';
            ret[i++] = 'V';
            num -= 4;
        }
        while(num > 0)
        {
            ret[i++] = 'I';
            num--;
        }
        ret[i] = '\0';
        return string(ret);
    }
};

