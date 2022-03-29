 class Solution {
public:
    bool XXX(string s) {
	if (s == "") return true;
	int iSize = s.size();
	if (iSize % 2 != 0) return false;
	stack<char> stackL;
	int iPos = 0;
	for (int i = 0; i < iSize; ++i)
	{
		char ch = s[i];
		if (ch == '(' || ch == '[' || ch == '{')
		{
			stackL.push(ch);
		}
		else if (ch == ')' && stackL.size() > 0)
		{
			if (stackL.top() == '(')
			{
				stackL.pop();
				continue;
			}
			else return false;
		}
		else if (ch == ']' && stackL.size() > 0)
		{
			if (stackL.top() == '[')
			{
				stackL.pop();
				continue;
			}
			else return false;
		}
		else if (ch == '}' && stackL.size() > 0)
		{
			if (stackL.top() == '{')
			{
				stackL.pop();
				continue;
			}
			else return false;
		}
		else  return false;

	}
    if(stackL.size() > 0) return false;
	return true;
} 
};

