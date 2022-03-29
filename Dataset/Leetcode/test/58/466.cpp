class Solution {
public:
int XXX(string s)
{
    auto be=s.rbegin(),ed=s.rend();
    while(be!=ed)
    {
        if(*be==' ')be++;
        else break;
    }
    int num=0;
    while(be!=ed&&*be!=' '){num++;be++;}
    return num;
}
};

