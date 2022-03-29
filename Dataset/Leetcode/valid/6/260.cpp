 class Solution {
public:
	string XXX(string s, int numRows) {
		int len = s.length();
		if (numRows == 1 || len <= numRows) return s;
		//v:一个v形状的字符数目，vnm:v形状的数量
		int v = 2 * (numRows - 1), vnum = (len - 1) / v, cur = 0;
		string res(len, '\0');
		//第0行
		for (int i = 0; i < len; i += v) res[cur++] = s[i];
		//中间1到numRow-2行
		for (int r = 1; r <= numRows - 2; ++r) {
			for (int k = 0; k < vnum; ++k) {
				res[cur++] = s[r + v * k];
				res[cur++] = s[v - r + v * k];
			}
                        //处理最后的残缺V
			if (r + v * vnum < len) res[cur++] = s[r + v * vnum];
			if (v - r + v * vnum < len) res[cur++] = s[v - r + v * vnum];
		}
		//最后numRow-1行
		for (int i = numRows - 1; i < len; i += v) res[cur++] = s[i];
		return res;
	}
};

