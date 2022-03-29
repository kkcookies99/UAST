class Solution {
    public int XXX(int x) {
    try {
	if(x > 0) {
		StringBuilder str = new StringBuilder().append(x);
		return Integer.parseInt(str.XXX().toString());
	}else {
		StringBuilder str = new StringBuilder().append(-x);
		return Integer.parseInt(str.XXX().toString())*(-1);
		}
	}catch (NumberFormatException e) {
                return 0;
        }
    }
}

