echo "enter the limit" 
read num 
a = 0
b = 1
c = 0 
count = 1 
while [$count -le $num]
do 
echo $c
c =`expr $a + $b` 
$a =$b 
$b = $c 
$count = `expr $n + 1`
done