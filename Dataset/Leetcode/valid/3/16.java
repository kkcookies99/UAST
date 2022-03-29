 class Solution {
    public int XXX(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        if ("".equals(s.trim())) {
            return 1;
        }
        int lenght = 1;
        String temp;
        int begin = 0;
        int end;
        for (; begin < s.length() - 1; begin++){
            for (end = begin + 1; end < s.length() + 1; end++) {
                temp = s.substring(begin, end);
                if (containRepeatChar(temp)) {
                    break;
                } else {
                    if (lenght < temp.length()) {
                        lenght = temp.length();
                    }
                }
            }
        }
        return lenght;
    }

    //判断某个字符串中是否有重复字符
    public boolean containRepeatChar(String str){
        if(str==null||str.isEmpty()){
            return false;
        }
        char[] elements=str.toCharArray();
        for(char e:elements){
            if(str.indexOf(e)!=str.lastIndexOf(e)){
                return true;
            }
        }
        return false;
    }
}

