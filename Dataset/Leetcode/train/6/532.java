 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1){
            return s;
        }

        char[] charArray = s.toCharArray();
        int length = s.length();
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i+=(2*numRows-2)) {//第一行
            sb.append(charArray[i]);
            list.add(i);
        }

        for (int j = 1; j < numRows; j++) {

            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)+j<length){
                    sb.append(charArray[list.get(i)+j]);
                }

                if(((list.get(i)+2*numRows-2-j)<length)&&(list.get(i)+2*numRows-2-j)!=list.get(i)+j){
                    sb.append(charArray[list.get(i)+2*numRows-2-j]);
                }
            }

        }


        return sb.toString();


    }
}

