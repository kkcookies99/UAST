class Solution {
public:
    int XXX(int m, int n) {
		int C=m+n-2;
		long long res=1;
		for(int i=0;i<min(m,n)-1;i++)
		{
			res=res*(C-i)/(i+1);
		}
		return res;
    }
};

