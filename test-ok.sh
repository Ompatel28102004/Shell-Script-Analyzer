# Variable assignments
x=1
y=5
message="Looping through values"

# If-Else condition
if [ $x -lt $y ]
then
    echo "x is less than y"
else
    echo "x is not less than y"
fi

# For loop
for item in one two three
do
    echo $message
    echo $item
done

# While loop with arithmetic increment
while [ $x -lt 3 ]
do
    echo $x
    x=$((x + 1))
done

add=$((5+2))
echo "Addition of a and b are: "${add}