 class Solution {
public:
    string XXX(int num) {
        string res;
        int temp = num;

        // 1000
        for(int i = 0; i < num / 1000; i++)
        {
            res.push_back('M');
            temp -= 1000;
        }
        num = temp;

        // 100
        if(num / 100 == 9)
        {
            res.push_back('C');
            res.push_back('M');
            temp -= 900;
        } else if(num / 100 > 4 && num / 100 < 9 )
        {
            res.push_back('D');
            temp -= 500;
            num = temp;
            for(int i = 0; i < num / 100; i++)
            {
                res.push_back('C');
                temp -= 100;
            }
        } else if(num / 100 == 4)
        {
            res.push_back('C');
            res.push_back('D');
            temp -= 400;
        } else
        {
            for(int i = 0; i < num / 100; i++)
            {
                res.push_back('C');
                temp -= 100;
            }
        }
        num = temp;

        // 10
        if(num / 10 == 9)
        {
            res.push_back('X');
            res.push_back('C');
            temp -= 90;
        } else if(num / 10 > 4 && num / 10 < 9 )
        {
            res.push_back('L');
            temp -= 50;
            num = temp;
            for(int i = 0; i < num / 10; i++)
            {
                res.push_back('X');
                temp -= 10;
            }
        } else if(num / 10 == 4)
        {
            res.push_back('X');
            res.push_back('L');
            temp -= 40;
        } else
        {
            for(int i = 0; i < num / 10; i++)
            {
                res.push_back('X');
                temp -= 10;
            }
        }
        num = temp;

        // 1
        if(num == 9)
        {
            res.push_back('I');
            res.push_back('X');
        } else if(num > 4 && num < 9 )
        {
            res.push_back('V');
            temp -= 5;
            num = temp;
            for(int i = 0; i < num; i++)
            {
                res.push_back('I');
            }
        } else if(num == 4)
        {
            res.push_back('I');
            res.push_back('V');
        } else
        {
            for(int i = 0; i < num; i++)
            {
                res.push_back('I');
            }
        }
        return res;
    }
};

