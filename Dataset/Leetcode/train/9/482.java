 class Solution {
    public boolean XXX(int x) {
          String x1= String.valueOf(x);
       List list = new ArrayList<>();
       List list2 = new ArrayList<>();
       for(int i = x1.length()-1;i >-1 ;i--){
           list.add(x1.charAt(i));

       }
       for(int i = 0;i <x1.length() ;i++){
           list2.add(x1.charAt(i));

       }

       if (list.equals(list2)){
           return true;
       }else{
           return false;
       }
        
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


