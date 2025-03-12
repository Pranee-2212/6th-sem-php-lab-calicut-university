echo "Enter a number" 
read num 
rev = $(echo $num | rev) 
if [ $num -eq $rev ]
then
echo "the number is a palindrome"
else
echo "the number is not a palindrome"
fi 
