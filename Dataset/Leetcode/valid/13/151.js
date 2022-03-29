var XXX = function(s) {
   var json1 = {"IV":4,"IX":9,"XL":40,"XC":90,"CD":400,"CM":900};
   var json2 = {"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000};
    var number = 0;
    for(var i=0;i<s.length;i++){
        var str = s.substr(i,2);
        if(json1[str]>0){
            number += json1[str];
            i++;
        }else{
            str = s.charAt(i);
            number += json2[str];
        }
    }
    return number;
};

