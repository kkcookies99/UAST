 class Solution {
    public String XXX(int num) {
        char[] romanBaseNum = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        StringBuilder sb = new StringBuilder();
        getRomaNum(num, 0, romanBaseNum, sb);
        
        return sb.reverse().toString();
       
    }

    private void getRomaNum(int num, int posId, char[] romanBaseNum, StringBuilder sb) {
        if (num == 0) {
            return;
        }
        //当前posId只能够往前2位选择，包含自己共3位

        int curPosNum = num % 10;
        if (curPosNum < 4) {
            for (int i = 0; i < curPosNum; ++i) {
                sb.append(romanBaseNum[posId]);
            }
        } else if (curPosNum == 4) {
            sb.append(romanBaseNum[posId + 1]);
            sb.append(romanBaseNum[posId]);
        } else if (curPosNum == 5) {
            sb.append(romanBaseNum[posId + 1]);
        } else if (curPosNum < 9) {
            for (int i = 0; i < curPosNum - 5; ++i) {
                sb.append(romanBaseNum[posId]);
            }
            sb.append(romanBaseNum[posId + 1]);
        } else {
            sb.append(romanBaseNum[posId +2]);
            sb.append(romanBaseNum[posId]);
        }

        getRomaNum(num / 10, posId + 2, romanBaseNum, sb);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


