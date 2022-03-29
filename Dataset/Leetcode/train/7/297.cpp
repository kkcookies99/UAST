class Solution {
public:
    int XXX(int x) {
        string s=to_string(x);
        if(s[0]=='-')
            std::XXX(s.begin()+1,s.end());
        else
            std::XXX(s.begin(),s.end());
        try
        {
            stoi(s);
        }
        catch(out_of_range err)
        {
            return 0;
        }
        return stoi(s);
    }
};

