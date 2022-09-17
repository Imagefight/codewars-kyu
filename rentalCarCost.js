function rentalCarCost(d) {
  // Calculate the Sum in the beginning
  let sum = d * 40;
  // If d is greater than 3, subtract 20.
  if (d >= 3){
    sum -= 20;
    // if it is greater than seven, subtract 30 to create -50.
    if (d >= 7){
      sum -= 30;
    }
  }
  // return the sum.
  return sum;
}
