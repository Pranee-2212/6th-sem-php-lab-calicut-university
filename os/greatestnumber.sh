echo "enter the first number "
read a 
echo "enter the second number "
read b 
echo "enter the third number "
read c 

l=$a 
if [$b -gt $l]
then
l=$b 
fi 
if [$c -gt $l]
then
l=$c 
fi 
echo "the greatest number between them is $l" 
