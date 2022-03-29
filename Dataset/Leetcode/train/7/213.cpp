class Solution {
public:
    int XXX(int x) {
    	long int num = 0;
    	int pop;
    	while(x != 0)
    	{
    		pop = x%10;
    		x /= 10;
    		num = num * 10 + pop;
    	}
		if(num>INT_MAX || num<INT_MIN)
			return 0;
		return num;
}
};

