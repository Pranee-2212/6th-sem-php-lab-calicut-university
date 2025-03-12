echo "Enter a number "
read n 
if [`expr $n % 2` -eq 0]
then
echo "number is odd"
else
echo "the number is even"
fi 
