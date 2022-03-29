 class Solution {
public:
    map<int, char>hash = { {1, 'I'}, {5, 'V'},{10, 'X'},{50, 'L'},{100, 'C'},{500, 'D'},{1000, 'M'} };
    string XXX(int num) {
        string res;
        int value=1000;
        while(value)
        {
            int x=num/value;
            if(x>0&&x<4)
            {   
                for(int i=0;i<x;i++)
                res+=hash[value];
            }
            else if(x==4)
            {
                res+=hash[value];
                res+=hash[value*5];
            }
            else if(x>4&&x<9)
            {   
                res+=hash[value*5];
                for(int i=0;i<x-5;i++)
                res+=hash[value];
            }
            else if(x==9)
            {
                res+=hash[value];
                res+=hash[value*10];
            }
            num%=value;
            value/=10;
            
        }
        return res;
    }
};

