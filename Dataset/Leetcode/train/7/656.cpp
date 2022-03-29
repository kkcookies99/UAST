 class Solution {
public:
    int XXX(int x) {
    int s[400];
    long long int ans=0, flag = 0;
    long long int cnt = 1, i=0;

    memset(s, 0, sizeof(s));

    if(x <= -2147483648 || x >= 2147483647) return 0;
    if(x >= 0) flag = 1;
    else x = 0-x;

    while(x != 0){
        s[i] = x%10;
        x = x/10;
        i++;
    }

    cnt = 1;
    for(int j = i-1; j >= 0; j--){
        ans += cnt*(s[j]);
        cnt *= 10;
    }
	
    if(ans > pow(2, 31)-1 || ans < 0-pow(2,31))
        return 0;

    if(flag == 1)
        return ans;
    else
        return 0-ans;
    }
};

