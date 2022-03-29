var XXX = function(x) {
    let min = 0;
    let max = x;
    while(min <= max){
        let mid = min + Math.floor((max - min) / 2);
        if(mid === x / mid){
            return mid;
        }else if(mid > x / mid){
            if(mid - 1 < x / (mid - 1)){
                return mid - 1;
            }
            max = mid - 1;
        }else{
            if((mid + 1) * ((mid + 1)) > x){
                return mid;
            }
            min = mid +1;
        }
    }
    return 0;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


