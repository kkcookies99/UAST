 class Solution {
   public String XXX(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int[] data = new int[2];
        data[0] = 0;
        data[1] = 0;
        int start = 0;
        int end = 0;
        while (end < chars.length) {
            //获取向两边扩散的边界
            end = getNestStart(start, end, chars);
            //设置最长回文串起止
            setMax(start, end - 1, data, chars);
            start = end;
        }
        return s.substring(data[0], data[1] + 1);
    }

    private void setMax(int start, int end, int[] data, char[] chars) {
        while (start > 0 && end < chars.length - 1&&chars[start - 1] == chars[end + 1]) {
            start--;
            end++;
        }
        if (end - start > data[1] - data[0]) {
            data[0] = start;
            data[1] = end;
        }
    }

    private int getNestStart(int start, int end, char[] chars) {
        while (end<chars.length&&chars[start] == chars[end]) {
            end++;
        }
        return end;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

