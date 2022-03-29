class Solution {
    public int XXX(String s) {
        char[] chars = s.toCharArray();
        int index = chars.length - 1, count = 0;
        while(index >= 0 && chars[index] == ' ') index--;
        while(index >= 0 && chars[index--] != ' ') count++;
        return count;
    }
}

