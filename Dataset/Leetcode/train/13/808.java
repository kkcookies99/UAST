 class Solution {
    public int XXX(String s) {
      int sum = 0;
      HashMap<Character,Integer> map = new HashMap<>();
      map.put('I',1);
      map.put('V',5);
      map.put('X',10);
      map.put('L',50);
      map.put('C',100);
      map.put('D',500);
      map.put('M',1000);

      
      for(int i=0;i<s.length();i++){
         int value = map.get(s.charAt(i));
         if(i<s.length()-1 && value<map.get(s.charAt(i+1))){
             sum = sum-value;
         }else{
             sum = sum+value;
         }
     }
     return sum;
    }
}

