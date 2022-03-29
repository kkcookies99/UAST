 class Solution {
public:
	string XXX(int n) {
		vector<string>visited(n + 1, "");
		if (n == 1) {
			return "1";
		}
		if (n == 2) {
			return "11";
		}
		if (visited[n] != "") {
			return visited[n];
		}
		string result = XXX(n - 1);
		int left = 0;
		int right = result.size();
		string finalResult = "";
		while (left < right) {
			int count = 1;
			while ((left + 1) < right && result[left] == result[left + 1]) {
				count += 1;
				left += 1;
			}
		    finalResult += to_string(count);
			finalResult += result[left];
			left++;
		}
		if (visited[n] == "") {
			visited[n] = finalResult;
		}
		return finalResult;
	}
};


