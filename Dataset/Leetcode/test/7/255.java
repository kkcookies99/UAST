class Solution {
    public int XXX(int x) {
        if(x < 0) {
			String str = new StringBuilder(Integer.toString(x).substring(1)).XXX().toString();		
			long reserse = -Long.parseLong(str);
			if(reserse < Integer.MIN_VALUE)
				return 0;
			else
				return (int)reserse;
		}else {
			String str = new StringBuilder(Integer.toString(x)).XXX().toString();		
			System.out.println(str);
			long reserse = Long.parseLong(str);
			if(reserse > Integer.MAX_VALUE)
				return 0;
			else
				return (int)reserse;
		}
    }
}

