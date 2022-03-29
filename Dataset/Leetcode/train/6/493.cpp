 class Solution {
public:
    string XXX(string s, int numRows) {
    if (numRows == 1) return s;
	string res = "";
	int step = numRows * 2 - 2;
	for (int i = 0; i < numRows; i++) {
		for (int j = 0; i + j * step < s.size();j++)
		{
			res.append(s.substr(i + j * step,1));
			if (i != 0 && i != numRows - 1 && i + j * step + 2 * (numRows - i - 1) < s.size()) {
				res.append(s.substr(i + j * step + 2 * (numRows - i - 1), 1));
			}
		}
	}
	return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


