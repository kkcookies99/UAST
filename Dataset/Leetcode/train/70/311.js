var XXX = function(n) {
        function getClimb(n,l1,l2) {
         if (n === 1) return l1;
         if (n === 2) return l1+l2;
         else return getClimb(n-1,l2,l1+l2);
        }
       return getClimb(n,1,1);
};

