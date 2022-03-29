 class Solution {
    public String XXX(int num) {
      int [] number={1000,900,500,400,100,90,50,40,10,9,5,4,1};
      String []string={"M","CM", "D", "CD", "C","XC","L","XL","X","IX", "V", "IV","I"};
      StringBuffer stringbuffer = new StringBuffer("");
      while(num!=0){
        for(int i=0;i<number.length;){
           if(num>=number[i]){
            stringbuffer.append(string[i]);
            num=num-number[i];
            continue;
           }
           i++;
        }

      }

    return new String(stringbuffer);

    }
}

