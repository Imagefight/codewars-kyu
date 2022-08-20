function positiveSum(arr) {
  arr = arr.filter(value => value > 0);
  let sum = 0;
  arr.forEach(value => sum += value);
  return sum;
}
