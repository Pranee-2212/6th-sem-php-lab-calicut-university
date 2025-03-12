read -p "Enter a string: " str

vowels=$(echo "$str" | grep -o -i '[aeiou]' | wc -l)
consonants=$(echo "$str" | grep -o -i '[bcdfghjklmnpqrstvwxyz]' | wc -l)
digits=$(echo "$str" | grep -o '[0-9]' | wc -l)

echo "Vowels: $vowels"
echo "Consonants: $consonants"
echo "Digits: $digits"