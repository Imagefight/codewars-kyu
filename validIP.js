// You are to make a program which should intake a dot-decimal IPv4 address
// And then return if it is a valid IPv4 Address.
// There will be inputs other than numbers, there may be no input at all.
// You will input a string.
// The numbers in an ip address may not be below 0 and may not exceed 255.
function isValidIP(str) {
  
  // Split the string by dots
  let man = str.split(".");
  
  // Check how many strings are in the array
  if (man.length == 4){
    for(let i = 0; i < man.length; i++){
      // Run it through customs
      if (!validNumber(man[i])){return false;}
    }
    // If they all return true, it's good
    return true;
  }
  
  // Guilty until proven innocent!
  return false;
}

function validNumber(str){
  // If null, rejected!
  if (!str) {return false;}
  // If overweight or underweight, rejected!
  if ((Number(str) > 255) || (Number(str) < 0)) {return false;}
  // If the 0s are leading numbers, rejected!
  if (str.length > 1 && str[0] == 0) {return false;}
  // If there's a letter, rejected!
  if (/[^0-9]/.test(str)) {return false;}

  // It's a valid number
  return true;
}
