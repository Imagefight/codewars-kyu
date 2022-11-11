function digitize(n) {
  console.log(n);
  let m = n.toString().split('').reverse().map(Number);
  return m;
}
