    public String XXX(String s) {
         if (s == null || s.length() == 0) {
            return "";
        }
        int leftIndex=0,rightIndex=0;
        int[] range=new int[]{0,0};
        char[] str = s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            for(int j=0;j<2;j++){
                leftIndex=i;
                rightIndex=i+j;
            while(leftIndex>=0&&rightIndex<str.length){
                if(str[leftIndex]==str[rightIndex]){
                    leftIndex--;
                    rightIndex++;
                }
                else{
                    break;
                }
            }
            if(rightIndex-leftIndex-1>range[1]-range[0]+1){
                range[0]=leftIndex+1;
                range[1]=rightIndex-1;
            }
            }
        }
        return s.substring(range[0],range[1]+1);
    }

