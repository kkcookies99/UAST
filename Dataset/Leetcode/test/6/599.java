 class Solution {
    public String XXX(String s, int numRows) {
        if (null == s || s.length() < 2 || numRows < 2) {
            return s;
        }
        int maxLength = s.length()/(numRows-1); 
        Character[][] array = new Character[numRows][s.length()];
        char[] elements = s.toCharArray();
        int m = 0;
        int n = 0;
        array[m++][n] = elements[0];
        boolean down = true; // 字符向下走还是向上走
        for (int i = 1; i < elements.length; i ++) {
            //System.out.println(m + " " + n + " " + down + " " + elements[i]);
            array[m][n] = elements[i];
            if (i%(numRows-1) == 0) {
                // 到旋转位置
                down = !down;
            }
            if (down) {
                m++;
            } else {
                m--;
                n++;
            }       
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j ++) {
                if (null != array[i][j]) {
                    sb.append(new Character(array[i][j]).toString());
                }                
            }
        }
        return sb.toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


