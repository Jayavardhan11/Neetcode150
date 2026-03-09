/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(n) {
    let Xcopy = Math.abs(n);
  let rev =0;
  while (Xcopy > 0) {
    let rem = Xcopy % 10;
    rev = rev * 10 + rem;
    Xcopy = Math.floor(Xcopy / 10);
  }
  let limit = 2 ** 31;
  rev = n > 0 ? rev : -rev;
  if (rev < -limit || rev > limit - 1) return 0;

  return rev;
    
};