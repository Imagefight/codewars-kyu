function countPositivesSumNegatives(input) {
  // Input Validaiton, check if input exists (!input) or input's length is 0
  if (!input || input.length == 0) {return [];}
  
  // Assign the Positive toll and the negative sums to an integer
  let negatives = parseNegatives(input);
  let positives = parsePositives(input);
  
  // Return the toll and sum together (in the correct format.)
  return [positives, negatives];
}

// ParseNegatives will do just that, parse the array for negatives.
function parseNegatives(input){
  // Placeholder sum value
  let sum = 0;
  // Loop through the input
  input.forEach(number =>{
    // If the number is negative, add the value to the sum.
    if (number < 0) {sum += number;}
  });
  // Return the sum.
  return sum;
}

// ParsePositives will do the inverse of the above function. Parsing the positive integers.
function parsePositives(input){
  // Placeholder sum value
  let toll = 0;
  // Loop through the input array
  input.forEach(number =>{
    // If the number is positive, add the amount of positives to the toll.
    if (number > 0) {toll++;}
  });
  // Return the amount counted.
  return toll;
}
