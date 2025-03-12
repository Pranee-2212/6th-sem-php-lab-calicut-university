echo "Enter a number"
read n 
sum = 0 
p = n 
while [ $n -gt 0 ]
then 
$r = `expr  $n % 10` 
$sum = `expr $sum \* 10 + $r `
$n = `expr $n / 10 ` 
done 
echo "reverse of the number $p is $sum "