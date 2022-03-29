 var XXX = function(n) {
    if(n==1){
        return "1";
    }else{
        let arr=XXX(n-1).split("");
        let i=0;
        let j=1;
        let s=""
        while(j<=arr.length){
            if(arr[i]==arr[j-1]){
                j++;
            }else{
                s+=(j-i-1)+""+arr[i];
                i=j-1;
            }
        }
        s+=(j-i-1)+""+arr[i];
        return s;
    }
};

