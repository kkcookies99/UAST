 class Solution {
public:
     bool XXX(string s) {
        int f=0;
        int r=s.size()-1;
        bool T=false;
		for (int i=0;i<s.size ();i++)
		{
			if (s[i]>='A'&&s[i]<='Z')
				s[i]+=32;
		}
        while(f<r)
        {
			while (s[f]<'a'||s[f]>'z')
				f++;
			while (s[r]<'a'||s[r]>'z')
				r--;
            if (s[f]==s[r])
			{
                T=true;
				f++;
				r--;
			}
            else
            {
                T=false;
                break;
            }
        }
        return T;
    }
};

