class Solution {
    public boolean XXX(int x) {
       boolean ishui=false;
       if (x<0){
           ishui= false;
           return ishui;
       }
       int y=0;
       int z=x;
       while (x!=0){
           y=y*10+x%10;
           x=x/10;
       }
       if (y==z){
           ishui=true;
       }
       return ishui;
    }
}

