 class Solution {
public:
    int XXX(string s) {
    int j = 0;
        while(s[j]==' '){
            s.erase(0,s.find_first_not_of(" "));
            j++;
        }
	int flag = 1, i = 0;
	int r = 0;
	if (s[0] == '-')
		flag = 0;
	while (s[i])
	{
        if(i==0 && (s[0]=='+' || s[0] =='-')){
            i += 1;
            continue;
        }
		if (s[i] - '0' >= 0 && s[i] - '0' <= 9)
		{
            if(r > INT_MAX / 10){
                r =  INT_MAX;
                if(flag == 0)
                    return -2147483648;
                break;
            }
            else if(r == INT_MAX / 10){
                if(s[i]-'0' >=8 ){
                    if( flag == 0)
                        return -2147483648;
                    return INT_MAX;}
            }
			r = r * 10 + (int)(s[i] - '0');
			i += 1;
		}
		else
			break;
	}
	if (flag == 0)
		return (0 - r);
	return r;
    }
};

