 class Solution {
public:
	int XXX(string s) {
		unordered_map<char, int> data;
		int i = 0, result = 0;
		//i代表字串的起始位置，j表示字串的结束位置
		for (int j = 0; j < s.size(); ++j) {
			if (data.find(s[j]) != data.end()) {
				i = max(i, data[s[j]]);//当有字符重复时更新字串起始位置
			}
			result = max(result, j - i + 1);//判断当前字串与历史字串长度的大小
			data[s[j]] = j + 1;//更新这个字符最近出现的位置
		}
		return result;
	}
};

