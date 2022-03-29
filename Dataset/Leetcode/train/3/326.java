 public int XXX(String s) {
    int sum=0;
    int temp=0;
   for(int i=0;i<s.length();i++){
       char a=s.charAt(i);
       int tar=s.indexOf(a);
       if(tar==i){temp++;}
       else{temp=(i-s.lastIndexOf(a,i-1))<==temp ? (i-s.lastIndexOf(a,i-1)) : temp+1;}
       sum=sum<temp ? temp :sum;
   }
    return sum;

}

