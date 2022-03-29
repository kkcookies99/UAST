 class Solution {
    public int XXX(String s) {
        int result = 0 ;
        String[] data = {"IV","IX","XL","XC","CD","CM"};
     String[] begin = s.split("");
        List<Integer> list = new ArrayList<>();
   for (int i = 0; i<=begin.length-1;i++){
       if (i+1<= begin.length-1) {
           String judge = begin[i] + begin[i + 1];

       for (int j = 0; j<=data.length-1;j++){
           if (judge .equals(data[j])){
               list.add(translate(judge));
               begin[i] ="";
                begin[i+1] = "";
           }

       }

       }
       list.add(translate(begin[i]));
   }
    for (int number:list){
        result = result+number;
    }


        return  result;
}
    public  int translate(String s){
    int result =0 ;
 switch (s){
 case "I": {result = 1; break;}
 case "V":{result = 5;break;}
 case "X":{result = 10;break;}
 case "L":{result = 50;break;}
 case "C":{result = 100;break;}
 case "D":{result = 500;break;}
 case "M":{result = 1000;break;}
 case "IV":{result = 4;break;}
 case "IX":{result = 9;break;}
 case "XL":{result = 40;break;}
 case "XC":{result = 90;break;}
 case "CD":{result= 400;break;}
 case "CM":{result= 900;break;}
 }


    return  result;
    }
      }



