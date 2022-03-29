 class Solution {
public:
    int XXX(int x) {
    if(x==0)
        return 0;
    int sig;
    sig = (x>0)?1:(-1);
    string s = to_string(abs(x));
    string out;
    int len = s.length();
    for(int i = len-1; i >=0; --i)
    {
        out += s[i];
    }
    string max;
    max = (sig == 1)?to_string(static_cast<unsigned int>(pow(2,31)-1)):to_string(static_cast<unsigned int>(pow(2,31)));

    if(out.length() > max.length())
        return 0;
    else if(out.length() == max.length() && out > max)
        return 0;

    return sig*stoi(out);
    }
};

