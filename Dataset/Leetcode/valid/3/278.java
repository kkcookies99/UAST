 class Solution {
    public int XXX(String s) {
        Set digits=new HashSet<Character>();
        int result = 0;
        int startIndex = 0;
        char[] ss=s.toCharArray();
        for (int i=0;i<s.length();i++)
        {
            if (!digits.contains(ss[i])){
                digits.add(ss[i]);
            }else{
                if (result<digits.size()){
                    result = digits.size();
                }
                while (ss[startIndex]!=ss[i]){
                    digits.remove(ss[startIndex]);
                    startIndex++;
                }
                startIndex++;
            }
        }
        if (result<digits.size()){
                    result = digits.size();
                }
        return result;
    }
}

