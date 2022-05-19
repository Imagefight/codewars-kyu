// Input will always be an array of strings
// You are to find every string that has exactly four characters
// If it is not a string with four characters, do not output
function friend(friends){
  // Use the filter function to output only those with the specified name lengths
  return friends.filter(name => name.length == 4);
}
