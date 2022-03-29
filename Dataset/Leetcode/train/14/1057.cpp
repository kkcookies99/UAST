 class Solution {
public:
      string XXX(vector<string>& strs) 
{
    if(strs.empty() == true) return "";
	if (strs.size() == 1) return strs[0];
	for (int i = 0; i < strs[0].length(); i++)//默认拿第一个字符串与后面的字符串对比
	{
		char ch = strs[0][i];
		for (int j = 1; j < strs.size(); j++)
        {
			if (ch != strs[j][i]) return strs[0].substr(0, i);//找到第一个不同的字符就返回
        }
	}
	return strs[0];//程序运行到这里说明未找到不同字符
}
};

