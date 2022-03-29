  public String XXX(int num) {
        String result = "";
        int[] key = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] value = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for (int i=0;i<key.length;i++){
            if (num/key[i]>0){
                int count = num/key[i];
                num=num%key[i];
                for (int n=0;n<count;n++){
                    result+=value[i];
                }
            }
        }
        return result;
    }

