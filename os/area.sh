echo "Enter the radius " 
read r 
area=$(echo "3.14 * ($r * $r)" | bc)
d=2 * r
echo "Area of the circle is $area" 
circumfenece=$(echo "3.14 * $d" | bc)
echo "Circumference of the circle is $circumference" 
 
