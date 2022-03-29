public int XXX(int n) {
               int result=2;
       int lastResult=1;
       
       if(n == 1) {
           return lastResult;
       }
       if (n == 2) {
           return result;
       }
       while (n-- > 2) {
           result+=lastResult;
           lastResult=result-lastResult;
       }
       return result;
   }


