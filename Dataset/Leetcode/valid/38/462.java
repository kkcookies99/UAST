 class Solution {
    public String XXX(int n) {
        if(n == 1){
            return "1";
        }
        String before = XXX(n - 1);
        int len = before.length();
        char[] beforeArray = before.toCharArray();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while(index <len){
            int counter = 1;
            while(index + 1 < len && beforeArray[index + 1] == beforeArray[index]){
                index ++;
                counter++;
            }
            sb.append(String.valueOf(counter));
            sb.append(String.valueOf(beforeArray[index]));
            index++;
        }
        return sb.toString();
    }
}

