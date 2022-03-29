 public int XXX(int[] prices) {
        int max=0;
        int minBefore=prices[0];
        for(int i: prices){
            if((i-minBefore) > max)max = i-minBefore;
            if(i<minBefore)minBefore=i;
        }
        return max;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


