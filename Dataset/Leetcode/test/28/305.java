 class Solution {
    public int XXX(String haystack, String needle) {
        if (needle.equals(""))
            return 0;
        String regex = "[a-z]*" + needle + "[a-z]*";
        int i = 0;
        if (haystack.matches(regex)) {
            haystack = haystack.replaceFirst(needle, "0");
            while (haystack.charAt(i) != '0'){
                if (i > haystack.length()-1){
                    System.out.println("Error!");
                    return -1;
                }
                i++;
            }
        } else return -1;
        return i;
    }
}

