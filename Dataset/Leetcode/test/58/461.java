class Solution {
    public int XXX(String s) {
        char[] data =s.trim().toCharArray();
        int res = -1;
        for(int i=0;i<data.length;i++) if(data[i] == ' ') res=i;
        return data.length - 1 - res;
    }
}

