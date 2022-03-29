 class Solution {
public:
    string XXX(int num) {

        string ret;
        while(num != 0)
        {
            if(num >= 1000)
            {
                ret.push_back('M');
                num -= 1000;
            }
            else if(num >= 900)
            {
                ret.push_back('C');
                ret.push_back('M');
                num -= 900;
            }
            else if(num >= 500)
            {
                ret.push_back('D');
                num -= 500;
            }
            else if(num >= 400)
            {
                ret.push_back('C');
                ret.push_back('D');
                num -= 400;
            }
            else if(num >= 100)
            {
                ret.push_back('C');
                num -= 100;
            }
            else if(num >= 90)
            {
                ret.push_back('X');
                ret.push_back('C');
                num -= 90;
            }
            else if(num >= 50)
            {
                ret.push_back('L');
                num -= 50;
            }
            else if(num >= 40)
            {
                ret.push_back('X');
                ret.push_back('L');
                num -= 40;
            }
            else if(num >= 10)
            {
                ret.push_back('X');
                num -= 10;
            }
            else if(num >= 9)
            {
                ret.push_back('I');
                ret.push_back('X');
                num -= 9;
            }
            else if(num >= 5)
            {
                ret.push_back('V');
                num -= 5;
            }
            else if(num >= 4)
            {
                ret.push_back('I');
                ret.push_back('V');
                num -= 4;
            }
            else if(num >= 1)
            {
                ret.push_back('I');
                num -= 1;
            }
            else
            {
                ;
            }
        }
        return ret;
    }
};

