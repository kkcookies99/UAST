class Solution {
public:
	string XXX(int n) {
		int num = 1;
		string ans = "";
		vector<string> dp(31);
		dp[1] = "1";
		dp[2] = "11";
		for (int i = 3; i < 32; i++){
			ans = "";
			vector<int> count_single;//记录某个字符的连续出现的次数
			vector<char> string_single;//记录某个连续出现的字符
			string str = dp[i - 1];
			int pos = 0;
			int count = 1;
			while (pos < str.size() - 1){
				if (str[pos] == str[pos + 1]){
					count++;
					pos++;
				}
				else{
					pos++;
					count_single.push_back(count);
					string_single.push_back(str[pos - 1]);
					count = 1;
				}
			}
			if (str[pos] == str[pos - 1]){
				count_single.push_back(count);
				string_single.push_back(str[pos]);
			}
			if (str[pos] != str[pos - 1]){
				count_single.push_back(1);
				string_single.push_back(str[pos]);
			}
			for (int m = 0; m <= count_single.size() - 1; m++){
				ans += to_string(count_single[m]);
				ans += string_single[m];
			}
			dp[i] = ans;
		}
		return dp[n];
	}
};

