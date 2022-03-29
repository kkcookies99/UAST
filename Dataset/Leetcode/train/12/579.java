 class Solution {
    public String XXX(int num) {
        int curNum = 0;
        StringBuilder sb = new StringBuilder("");
        while (num != curNum) {
            int d = num - curNum;
            if (d > 0) {
                if (d < 4) {
                    sb.append('I');
                    curNum += 1;
                }
                else if (4 <= d && d < 9) {
                    sb.append('V');
                    curNum += 5;
                }
                else if (9 <= d && d < 40) {
                    sb.append('X');
                    curNum += 10;
                }
                else if (40 <= d && d < 90) {
                    sb.append('L');
                    curNum += 50;
                }
                else if (90 <= d && d < 400) {
                    sb.append('C');
                    curNum += 100;
                }
                else if (400 <= d && d < 900)  {
                    sb.append('D');
                    curNum += 500;
                }
                else {
                    sb.append('M');
                    curNum += 1000;
                }
            }
            else {
                char lastChar = sb.charAt(sb.length()-1);
                if (lastChar == 'D' || lastChar == 'M'){
                    sb.insert(sb.length() - 1, 'C');
                    curNum -= 100;
                }
                else if (lastChar == 'L' || lastChar == 'C'){
                    sb.insert(sb.length() - 1,'X');
                    curNum -= 10;
                }
                else {
                    sb.insert(sb.length() - 1, 'I');
                    curNum -= 1;
                }
            }
        }
        return sb.toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


