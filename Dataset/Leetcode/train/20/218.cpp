 class Solution {
public:
    bool XXX(string s) {
        map<char, char> m;
	m[')'] = '(';
	m[']'] = '[';
	m['}'] = '{';
	stack<char> stack;
	for (char& c : s)
	{
		map<char, char>::iterator ret = m.find(c);
		//当前字符为左括号，应入栈
		if (ret == m.end())
			stack.push(c);
			//当前字符为右括号，先检查栈是否为空，为空直接不匹配，不为空就应检查是否与栈顶括号匹配，匹配则将栈顶元素出栈，不匹配直接返回false
		else if (!stack.empty())
		{
			//不匹配
			if ((*ret).second != stack.top())
				return false;
			//匹配
			stack.pop();
		}
		else
			return false;
	}
	return stack.empty();
    }
};

