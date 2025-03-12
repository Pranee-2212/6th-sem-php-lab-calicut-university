echo "enter the limit"
read limit 
n = 2 
while [$n -le $limit]
do 
i = 1
f = 0 
while [$i -le $n]
do 
if [`expr $n % $i` -eq 0]
then
f = `expr $f + 1`
fi
i = `expr $i + 1`
done
if [$f -eq 2]
then
echo $n
fi
n = `expr $n + 1`
done 

