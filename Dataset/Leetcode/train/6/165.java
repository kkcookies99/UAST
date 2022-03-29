 class Solution {
    public String XXX(String s, int numRows) {
       
        if(numRows == 1){
            return s;
        }

        char[] ss = s.toCharArray();
        int totalLength = ss.length;


        int[] formattedIndex = new int[totalLength];
        int leftSpace = 2 * numRows - 2;
        int rightSpace = 0;

        for(int i = 0, index = 0; i < numRows && index < totalLength; i++){
            int max = i;
            boolean flag = true;
            int lastAdd = i;
            formattedIndex[index] = i;
            index++;
            while(totalLength - 1 >= (flag ? max + (leftSpace - i * 2) : max + (rightSpace + i * 2))){
                if(flag){
                    max = max + (leftSpace - i*2);
                    flag = false;
                }else{
                    max = max + (rightSpace + i*2);
                    flag = true;
                }
                if(max != lastAdd){
                    formattedIndex[index] = max;
                    index++;
                    lastAdd = max;
                }
            }
        }

        char[] newChars = new char[totalLength];
        for(int i = 0; i < formattedIndex.length; i++){
            int index = formattedIndex[i];
            newChars[i] = ss[index];
        }
        return new String(newChars);
    }

    
}

