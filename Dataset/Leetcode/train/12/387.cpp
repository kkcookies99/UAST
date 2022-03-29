 class Solution {
public:
    string XXX(int num) {
        map<int,char> d;
        d[1] = 'I';
        d[5] = 'V';
        d[10] = 'X';
        d[50] = 'L';
        d[100] = 'C';
        d[500] = 'D';
        d[1000] = 'M';
        string res;
        int b = 1;
        while (num != 0){
            int x = num % 10;
            if (x < 4)
            for(int i=0;i<x;i++)
            res = d[b] + res;
            else if(x == 4)
            {
                res = d[5*b] + res;
                res = d[b] + res;
            }
            else if(x < 9)
            {
                for(int i=0;i<x-5;i++)
                res = d[b] + res;
                res = d[5*b] + res;
            } else if (x == 9)
            {
                res = d[10*b] + res;
                res = d[b] + res;
            }
            num = num / 10;
            b = b * 10;
        }
        return res;
    }
};

