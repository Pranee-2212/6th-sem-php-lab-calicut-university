echo "enter a number "
read n 
p = n 
sum = 0 
while [$n -gt 0 ]
do 
r=`expr $n % 10`
sum = `expr $sum +$r` 
n= `expr $n / 10`
done 
echo "sum of digits of $p is $sum " 
 