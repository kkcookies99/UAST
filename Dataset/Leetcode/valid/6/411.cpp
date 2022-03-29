 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1) return s; 
        int stap = numRows * 2 - 2;   //步长
        int size = s.size();
        string ret;
        int fast = 0;
        while(fast < size){  //第一行
            ret += s[fast];
            fast += stap;
        }
        numRows -= 2; // 第二行到倒数第二行
        for(int a = 1; a <= numRows; ++a){  
            fast = stap - a;
            int man = a; //原谅我根本想不到更好的变量名，用意呢就是从第二行开始，同一个步长中出现了两个数字，so------
            while(fast < size || man < size){
                if(man < size){
                    ret += s[man];
                    man += stap;
                }
                if(fast < size){
                    ret += s[fast];
                    fast += stap;
                }
            }
        }
        fast = stap - numRows - 1;  //最后一行
        while(fast < size){
            ret += s[fast];
            fast += stap;
        }
        return ret;
    }
};

