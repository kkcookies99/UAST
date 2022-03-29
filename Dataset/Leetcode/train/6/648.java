 public String XXX(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        char[] array = s.toCharArray();
        int circleNum = 2 * numRows - 2;
        int blockNum = array.length / circleNum + (array.length % circleNum == 0 ? 0 : 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < blockNum; j++) {
                if (i == 0) {
                    if (j * circleNum < array.length) {
                        sb.append(array[j * circleNum]);
                    }
                } else if (i < numRows - 1) {
                    if (j * circleNum + i < array.length) {
                        sb.append(array[j * circleNum + i]);
                    }
                    if (j * circleNum + circleNum - i < array.length) {
                        sb.append(array[j * circleNum + circleNum - i]);
                    }
                } else {
                    if (j * circleNum + i < array.length) {
                        sb.append(array[j * circleNum + i]);
                    }
                }
            }
        }

        return sb.toString();
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


