public boolean XXX(int x) {
  if(x < 0) return false;
  String s = String.valueOf(x);
  char[] chars = s.toCharArray();
  for(int i = 0;i < chars.length / 2;i++){
      if(chars[i] != chars[chars.length-1-i]){
        return false;
      }
  }
  return true;
}

