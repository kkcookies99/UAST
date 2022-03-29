 var XXX = function(num) {
      var map = { "1": "I","4": "IV","5":"V","9": "IX","10": "X","40": "XL","50": "L","90": "XC","100": "C","400": "CD",
          "500": "D",
          "900": "CM",
          "1000":"M"
      },
      arr = [1,4,5,9,10,40,50,90,100,400,500,900,1000],
      left = 0,
      res = "",
      right = arr.length - 1;
      while(num){
          left = 0;
        while(left + 1 < right){
          let mid = parseInt((left + right)/2);
          if(arr[mid] == num){
               res += map[arr[mid] + ''];
              return res;
          }
          if(arr[mid] > num)
          right = mid;
          else left = mid;
      }
      if(num >= arr[left + 1]){
           num = num - arr[left + 1];
      res += map[arr[left + 1] + ''];
      }
      else
      {
      num = num - arr[left];
      res += map[arr[left] + ''];
      }
    }
      return res;
};

