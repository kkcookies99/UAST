 class Solution {
    public String XXX(int num) {
StringBuilder ans = new StringBuilder();
      String [] romans ={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
      int [] values = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
      int i =romans.length-1;
      while (num>0){
          if (num>=values[i]){
              num-=values[i];
              ans.append(romans[i]);
          }else 
              i--;
      }
      return ans.toString();
    }
}

