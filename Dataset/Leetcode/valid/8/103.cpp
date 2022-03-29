class Solution {
public:
    int XXX(string s) {
        string s1 = "";
        if ((s[0] >= 'a' && s[0] <= 'z') || (s[0] >= 'A' && s[0] <= 'Z'))
			return 0;
		for (int i = 0; i < s.length(); i++)
		{
			if ((s[i]>='0'&&s[i]<='9')||s[i]=='-')
			{
				s1 += s[i];
			}
		}
		int a = atoi(s1.c_str());
		if (a > INT_MAX)
			a= INT_MAX;
		if (a < INT_MIN)
			a= INT_MIN;
        return a;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

