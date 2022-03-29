 class Solution {
public:
    string XXX(int n) {
    	string count1 , result;
    	stringstream ss;
    	if (n == 1) return "1";
    	else count1 = XXX(n - 1);
    	int j;
    	for (int i = 0; count1[i] !='\0'; i = i + j ) {
    		for (j = 0; count1[i] == count1[i + j]; j++) {}
    		ss << j;
    		ss << count1[i];
    	}
    	ss >> result;
    	return result;
    }
};

