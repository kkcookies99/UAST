 class Solution {
    public String XXX(int n) {
        if(n == 1) {
            return "1";
        }
        for(int i = 2;i<= n;i++) {
            if(n == i) {
                return read(XXX(i-1));
            }
        }
        return null;
    }
    public String read(String str) {
        int count = 0;
		String res = "";
        if(str.length() == 1) {
			return 1+str;
		}
        for(int i = 0;i<str.length() - 1;i++) {
            if(str.substring(i+1,i+2).equals(str.substring(i,i+1))){
                count++;
            }else{
                String res0 = str.substring(i,i+1);
                res += (count+1)+res0;
                count = 0;
            }
            if(i == str.length() -2) {
                res += (count+1)+str.substring(i+1,i+2);
            }
        }
        return res;
    }
}

