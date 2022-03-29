class Solution {
    public int XXX(int x) {
        String str = String.valueOf(x);
        int i =0;
        int j =str.length()-1;
        if(str.charAt(0)=='-')
            i++;
        char[] chars = str.toCharArray();
        while(i<j){
            char temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;
            i++;
            j--;
        }
        String s = "";
        for (char c:chars)
            s+=c;
        try{
            return Integer.parseInt(s);
        }catch(Exception e){
            return 0;
        }
    }
}

