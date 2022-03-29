class Solution {
public:
    int XXX(string s) {
        int count=0;
        int a=0;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]==' ') a=1;
            else
            {
                if(a==1) {a=0;count=0;}//关键点在如果搜索到字符的话要判定前一个字符是不是为‘ ’，若是吧count数组置为0
                count++;
            }
        }
        return count;

    }
};
code block

