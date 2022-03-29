 class Solution {
    public int XXX(String s) {
  int count=0;
  for(int i=s.length()-1;i>=0;i--){
   if(count==0&&s.charAt(i)==' '){
     continue;
   }
    if(count!=0&&s.charAt(i)==' '){
     break;
   }
    count++;

  }
  return count;
    }
}

