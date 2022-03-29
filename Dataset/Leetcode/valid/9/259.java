class Solution {
    public boolean XXX(int x) {
    if( x < 0 || (x % 10 == 0 && x!= 0)  ) {
		return false;
	}
	StringBuilder builder=new StringBuilder(String.valueOf(x));
	  return builder.toString().equals(builder.reverse().toString());
    }
}

