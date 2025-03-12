echo "Current user: $USER"
echo "Current time: $(date)"
echo "Current login time: $(who -u | grep "$USER" | awk '{print $4}')"
echo "Username: $(whoami)"
echo "Active users:"
who