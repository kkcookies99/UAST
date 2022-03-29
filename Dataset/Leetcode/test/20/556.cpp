 class Solution {
public:
    bool XXX(string s) {
        int l = s.size();
        if (l%2==1) return false;
        string p;
        char c,a;
        for(int i = 0;i<l;i++)
        {
            a = s[i];
            if(a=='(')p.push_back('(');
            else if (a=='[')p.push_back('[');
            else if (a=='{')p.push_back('{');
            else if (a=='}'&&p.size()>0)
            {
                c = p[p.size()-1];
                p.pop_back();
                if(c!='{') return false;
            }
            else if (a==']'&&p.size()>0)
            {
                c = p[p.size()-1];
                p.pop_back();
                if(c!='[') return false;
            }
            else if (a ==')'&&p.size()>0)
            {
                c = p[p.size()-1];
                p.pop_back();
                if(c!='(') return false;
            }
            else return false;

        }
        if(p.size()>0)return false;
        return true;
    }
};

