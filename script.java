<script>
function isPalindrome(word) {
word = word.toLowerCase();
let start = 0;
let end = word.length - 1;
for (start; start < end; start++, end--) {
if (word[start] !== word[end]) {
return false;
}
}
return true;
}
function checkPalindrome() 
{
let word = prompt("Enter a word:");
if (isPalindrome(word))
{
alert("The word is a palindrome!");
} 
else 
{
alert("The word is not a palindrome.");
}
}
checkPalindrome();
</script>