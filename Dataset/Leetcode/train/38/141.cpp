class Solution {
public:
    string XXX(int n) {
		if(1 == n) 
			return "1";
		string prev = XXX(n - 1);
		char curr = prev[0];
		int cnt = 0;
		string now;
		for(int i = 0; i < prev.size(); i++) {
			if(prev[i] == curr)
				cnt++;
			else {
				now += (to_string(cnt) + curr);
				curr = prev[i];
				cnt = 1;
			}
		}
		now += (to_string(cnt) + curr);
		return now;
    }
};

