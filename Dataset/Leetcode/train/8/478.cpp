 class Solution {
public:
    int XXX(string s) {
        int sign = 0;
	    short k = 0;
	    short y[11] = { 0 };
	    double r = 0;
	    bool start = false;
	    for (int i = 0; i < s.size(); i++) {
		    if (s[i] == 32 && !start) {
			    continue;
		    }else if(s[i] == 45&& !start){
			    sign = 1;
			    start = true;
			    continue;
		    }else if (s[i] == 43&& !start) {
			start = true;
			continue;
		}else {
			    start = true;
		    }
		    if (start&&k<11) {
			if (48 <= s[i] && s[i] <= 57) {
				if (!(k == 0 && s[i] == 48)) {
					y[k] = s[i] - 48;
					k++;
				}
			}
			else {
				break;
			}
		}
	    }
	for (int i = 0; i<k ; i++) {
		r = r + y[i] * pow(10,k-i-1);
	}
	r = sign ? r*(-1) : r;
	if (r > INT_MAX) r = INT_MAX;
	if (r < INT_MIN) r = INT_MIN;
	return int(r);
    }
};

