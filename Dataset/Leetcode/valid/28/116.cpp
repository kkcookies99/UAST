 class Solution {
public:
    int XXX(string haystack, string needle)
    {
        if(needle==" ")return 0;
        int c=needle.size();
        int d=haystack.size();
        if(c>d)return -1;
        if(haystack==needle)return 0;
        int i=0;
        while((i+c)<=d)
        {
            string a=haystack.substr(i,c);
            if(a==needle)return i;
            i++;
        }
    return -1;
    }
};

