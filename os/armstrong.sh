echo "enter the number "
reaad num 
s = 0
p = $num 
while [ $num -gt 0 ]
do 
r= `expr $num % 10`
s= `expr $s + $r \* $r \* $r`
n = `expr $num /10 ` 
done 
if [$ -eq $p ]
then 
echo "the number is armstrong" 
else
echo "the number is not armstrong"
fi 
