 class Solution {
public:
    void toRoman(int num, string& temp, int numTemp)
    {
        if (num)//递归继续条件
            toRoman(num / 10, temp, numTemp + 1);//递归时传进去的数字除以10，数量级加1
        else
            return;
        int last = num % 10;
        char I, V;//1和5均为单一字符
        string IV, IX;//4和9为字符串
        if (numTemp == 1)//判断数量级
        {
            I = 'I';
            V = 'V';
            IV = "IV";
            IX = "IX";
        }
        if (numTemp == 2)
        {
            I = 'X';
            V = 'L';
            IV = "XL";
            IX = "XC";
        }
        if (numTemp == 3)
        {
            I = 'C';
            V = 'D';
            IV = "CD";
            IX = "CM";
        }
        if (numTemp == 4)
        {
            I = 'M';
            V = ' ';
            IV = "";
            IX = "";
        }
        switch (last)
        {
        case 1: case 2: case 3:
            for (int i = 0; i < last; i++)
            {
                temp.push_back(I);
            }
            break;
        case 4: temp += IV;
            break;
        case 5: temp.push_back(V);
            break;
        case 6: case 7: case 8:
            temp.push_back(V);
            for (int i = 0; i < last - 5; ++i)
            {
                temp.push_back(I);
            }
            break;
        case 9:
            temp += IX;
            break;
        }
    }
    string XXX(int num) {
        string s;
        toRoman(num, s, 1);
        return s;
    }
};

