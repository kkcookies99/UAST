 class Solution {
    public String XXX(int num) {
        char[][] romaChar = new char[][]{
                {'I','V'},
                {'X','L'},
                {'C','D'},
                {'M'}};
        char[] numCh = (num + "").toCharArray();
        int x = numCh.length - 1;
        StringBuilder roma = new StringBuilder();
        for(int i = 0; i < numCh.length; i ++, x --){
            if(numCh[i] != '0')
                roma.append(getRoma(numCh[i], x, romaChar));
        }
        return roma.toString();
    }

    public String getRoma(char a, int x, char[][] romaChar){
        StringBuilder sb = new StringBuilder();
        switch (a){
            case '1' : {
                sb.append(romaChar[x][0]);
                break;
            }
            case '2' : {
                sb.append(romaChar[x][0]);
                sb.append(romaChar[x][0]);
                break;
            }
            case '3' : {
                sb.append(romaChar[x][0]);
                sb.append(romaChar[x][0]);
                sb.append(romaChar[x][0]);
                break;
            }
            case '4' : {
                sb.append(romaChar[x][0]);
                sb.append(romaChar[x][1]);
                break;
            }
            case '5' : {
                sb.append(romaChar[x][1]);
                break;
            }
            case '6' : {
                sb.append(romaChar[x][1]);
                sb.append(romaChar[x][0]);
                break;
            }
            case '7' : {
                sb.append(romaChar[x][1]);
                sb.append(romaChar[x][0]);
                sb.append(romaChar[x][0]);
                break;
            }
            case '8' : {
                sb.append(romaChar[x][1]);
                sb.append(romaChar[x][0]);
                sb.append(romaChar[x][0]);
                sb.append(romaChar[x][0]);
                break;
            }
            case '9' : {
                sb.append(romaChar[x][0]);
                sb.append(romaChar[x + 1][0]);
                break;
            }
        }
        return sb.toString();
    }
}

