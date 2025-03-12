echo "enter the first number"
read a 
echo "enter the second number"
read b 
echo "enter the third number"
read c 
m=$(`expr $a + $b + $c` / 3)

p=`expr $a - $m` 
q=`expr $b - $m`
r=`expr $c - $m` 

echo "the mean of three number is $m" 

deviation= `expr $p \* $p + $q \* $q + $r \* $r`
echo "the deviation of the 3 numbers is $deviation" 
