 class Solution {
public:
    bool XXX(string s) {
	stack<char>f;
	for (auto ite : s)
	{
		if (ite == '(' || ite == '[' || ite == '{')
			f.push(ite);
		else
		{
			if (!f.empty())
			{
				if ((ite == ')' && f.top() == '(')
                ||(ite == ']' &&f.top() == '[')
                ||(ite=='}' &&f.top() == '{'))
                    f.pop();
				else return false;
			}
			else return false;
		}
	}
	return f.empty() ? true : false;
    }
};

