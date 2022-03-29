 class Solution {

    public String XXX(int n) {
        //先描述字符的数量    再描述字符 例如 111 3个1   31
        StringBuilder result = new StringBuilder("1");
        for (int i = 0; i < n-1; i++) {
            StringBuilder sb = new StringBuilder();
            int length = result.length();
            for (int j = 0; j < length; j++) {
                int index = j+1;
                char tempChar = result.charAt(j);
                while(index<length&&tempChar==result.charAt(index)){
                    index++;
                }

                sb.append(index-j);
                sb.append(tempChar);
                j = index-1;

            }
            result = sb;
        }
        
        return result.toString();

    }
}

