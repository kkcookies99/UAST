 class Solution {
    public boolean XXX(String s) {
        List<Character> list = new ArrayList<>();
        for(char c : s.toCharArray()){
            if (Character.isLetter(c))
                list.add(Character.toLowerCase(c));
            if (Character.isDigit(c)){
                list.add(c);
            }
        }
        int len = list.size();
        if(len == 0) return true;
        int i = 0;
        for(i = 0; i<=len/2; i++){
            if(list.get(i) != list.get(len-1-i)){
                break;
            }
        }

        return i -1 == len / 2;
    }
}

