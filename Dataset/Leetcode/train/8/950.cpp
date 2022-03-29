 class Solution {
public:
    int XXX(string str) {
        int len = str.length();
		char * dat = new char[len+1];
		int sign = 1;
		int iter = 0;
		bool flag = 0,zeroflag =0,space = 0;
		for (int i = 0; i < len; i++)
		{
			if (int(str[i]) == 0x20&&space==0) { continue; }
			else if (int(str[i]) == 0x2b || int(str[i]) == 0x2d) { if (flag == 0) { sign = (int(str[i]) == 0x2b) ? 1 : -1; flag = 1; space = 1; } else break; }
			else if (int(str[i]) >= 0x30 && int(str[i]) <= 0x39) { 
				if (int(str[i]) == 0x30 && zeroflag == 0) { flag = 1; space = 1; continue; }
				dat[iter] = str[i]; iter += 1; flag = 1; zeroflag = 1; space = 1;
			}
			else if (int(str[i]) < 0x30 || int(str[i]) > 0x39) { if (i == 0) return 0; else break; }
		}
		dat[iter] = '\0';
		long int output = 0;
		int dat_len = strlen(dat);
		if (dat_len > 10) {	if (sign == -1) return INT32_MIN;	else return INT32_MAX;		}
		for (int i = 0; i < dat_len; i++) output = output + (int(dat[i]) - 48)*pow(10, dat_len - i - 1);
		output = sign * output;
		if (output > INT32_MAX) return INT32_MAX;
		if (output < INT32_MIN) return INT32_MIN;
		return output;
    }
};

