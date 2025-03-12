
echo "enter the base "
read base 
echo "enter the exponent"
read exp 

result=$(echo "$base^$exp" | bc)
echo "$base^$exp = $result"