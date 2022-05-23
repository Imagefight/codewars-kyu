// Receieve a url and return the domain name
// The input will always be a String
// It will always be a vaild url
// There will be no numbers.
function domainName(url){
  // Return what the helper functions get us
  return parsePrefix(url);
}

// Check the urls for the common prefixes
function parsePrefix(str){
  const http = RegExp("http://");
  const https = RegExp("https://");
  const www = RegExp("www.");
  
  // Split the urls by the prefix detected and return the second word in the array
  // If HTTP(S) check for a following www.
  if (http.test(str))   { 
    if (www.test(str))  {return parsePeriod(str.split("www.")[1]);}
    return parsePeriod(str.split("http://")[1]);
  }
  if (https.test(str))  {
    if (www.test(str))  {return parsePeriod(str.split("www.")[1]);}
    return parsePeriod(str.split("https://")[1]);
  }
  if (www.test(str))    {return parsePeriod(str.split("www.")[1]);}
  
  return parsePeriod(str);
}

// split the url by the dot and call it even
function parsePeriod(str){
  return str.split(".")[0];
}
