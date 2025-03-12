echo "Enter the file name:"
read filename

if [ -f "$filename" ]; then
    echo "Original content:"
    cat "$filename"
    echo
    echo "Content in uppercase:"
    tr '[:lower:]' '[:upper:]' < "$filename"
else
    echo "File not found!"
fi

