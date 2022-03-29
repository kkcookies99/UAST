 class Solution {
public:
    int XXX(string s) {
        char pre = 0;
        int result = 0;
        for(char &c:s)
        {
            switch(c){
                case 'I':result += 1;break;
                case 'V':
                if(pre == 'I')
                    result-=2;
                result += 5;break;
                case 'X':
                if(pre =='I')
                    result -= 2;
                result += 10;break;
                case 'L':
                if(pre == 'X')
                    result -=20;
                result += 50;break;
                case 'C':
                if(pre == 'X')
                    result -= 20;
                result += 100;break;
                case 'D':
                if(pre == 'C')
                    result -= 200;
                result += 500;break;
                case 'M':
                if(pre == 'C')
                    result -= 200;
                result += 1000;break;
            }
            pre = c;
        }
        return result;
    }
};

