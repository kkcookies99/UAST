class Solution {
public:
	bool XXX(int x) {
        int temp =x;
		if (x<0){
			return false;
		}
        long a = 0;
        while(x){
            a = a*10+x%10;
            x/=10;
        }//将x逆置，存放入a
		return a == temp;
	}
};

