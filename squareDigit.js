function squareDigits(num){
  // Make an array with the digits in the numbers
  // Convert the Number into a string, split it into individual digits, then map them all into numbers.
  let series = num.toString().split("").map(Number);
  // Iterator for enhanced for loop
  let iterator = 0;
  
  // For each number in the series
  series.forEach(numb =>{
    // Multiply the number by itself (square the number)
    series[iterator] = numb * numb;
    // Increment the Iterator
    iterator++;
  });
  // Join all numbers together, then parse them through the Number(function) to return them to the correct data type
  return Number(series.join(""));
}
