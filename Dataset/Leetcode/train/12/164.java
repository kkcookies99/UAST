 class Solution {
    public String XXX(int num) {
         NumberRelation[] nr =new NumberRelation[13];
         nr=add(nr);
         String str="";
         for(int i=nr.length-1;i>=0;i--){
               int n=num/nr[i].x;
               num=num-nr[i].x*n;
               while(n!=0){
                   str+=nr[i].y;
                   n--;
               }
         }
         return str;
  
    }


    NumberRelation[] add(NumberRelation[] nr){
         NumberRelation  n1=new NumberRelation(1,"I");
         nr[0]=n1;
         NumberRelation  n2=new NumberRelation(4,"IV");
         nr[1]=n2;
         NumberRelation  n3=new NumberRelation(5,"V");
         nr[2]=n3;
         NumberRelation  n4=new NumberRelation(9,"IX");
         nr[3]=n4;
         NumberRelation  n5=new NumberRelation(10,"X");
         nr[4]=n5;
         NumberRelation  n6=new NumberRelation(40,"XL");
         nr[5]=n6;
         NumberRelation  n7=new NumberRelation(50,"L");
         nr[6]=n7;
         NumberRelation  n8=new NumberRelation(90,"XC");
         nr[7]=n8;
         NumberRelation  n9=new NumberRelation(100,"C");
         nr[8]=n9;
         NumberRelation  n10=new NumberRelation(400,"CD");
         nr[9]=n10;
         NumberRelation  n11=new NumberRelation(500,"D");
         nr[10]=n11;
         NumberRelation  n12=new NumberRelation(900,"CM");
         nr[11]=n12;
         NumberRelation  n13=new NumberRelation(1000,"M");
         nr[12]=n13;

        return nr;
    }
}
class NumberRelation{
     Integer x;
     String  y;
     public NumberRelation(Integer x ,String y){
         this.x=x;
         this.y=y;
     }
}

