 class Solution {
public:
    void emulate(char* pos, int pos_len, vector<string>& ans, int seq, int cnt_left, int idx) {

		if (cnt_left == 0) {
			ans.push_back(string(pos, pos + pos_len));
			return;
		}

		for (int i = idx; i <= (seq * 2); i++) {
			pos[i] = '(';
			emulate(pos, pos_len, ans, seq + 1, cnt_left - 1, i + 1);
			pos[i] = ')';
		}
	}

	vector<string> XXX(int n) {

		char* pos = (char*)malloc(sizeof(char)* n * 2);
		for (int i = 0; i < (n * 2); i++) {
			pos[i] = ')';
		}

		vector<string> ans;
		emulate(pos, n * 2, ans, 0, n, 0);
		free(pos); pos = 0;
		return ans;
	}
};

