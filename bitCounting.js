// Find the amount of ones in the binary equivalent of the input provided
// There will be No Negative numbers
// There will be no edge cases
var countBits = function(n) {
  // Make a function that converts the input to binary, then pass the input to the function.
  // Filter the binary output of all of its 1s using .filter( x == 1 ), and output the length of that array using .length
  
  return toBinary(n).split("").filter(bit => bit == 1).length;
};

// Get the binary equivalent using toString(2)
function toBinary(inp){
  return inp.toString(2);
}
