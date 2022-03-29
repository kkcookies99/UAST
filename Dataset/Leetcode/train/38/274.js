var XXX = function(n) {
      let str = '1';
      let counter = 1;
      let result = [1];
      while (n - 1 > 0) {
         n--;
         if (result.length > 0) {
            str = result.join('');
            result = [];
         }
         for (let i = 0; i < str.length; i++) {
            if (str[i] === str[i + 1]) {
               counter++;
            } else {
               result.push(counter);
               result.push(str[i]);
               counter = 1;
            }
         }
      }
      return result.join('');
};

