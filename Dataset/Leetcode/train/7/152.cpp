class Solution {
public:
    int XXX(int x) {
    if (x==0||x==(-2147483648)) return 0;
    float dw = pow(10,int(log10(abs(x))));
    int32_t n = 0;float about = (x%10 * dw);
    while (x) {
		n = n * 10LL + x % 10;
		x /= 10;
	}
	if (about - dw > n || about + dw < n) return 0;
	cout << n;
	return n;
    }
};

