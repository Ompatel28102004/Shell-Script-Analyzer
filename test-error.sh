# Missing closing ] in condition
if [ $x -lt $y
then
    echo "Invalid condition"
fi

# Invalid arithmetic syntax (missing outer $(()))
x=(x + 1)

# Assignment without value
y=

# Invalid echo content (invalid character)
echo @invalid!

# For loop with missing 'done'
for i in 1 2 3
do
    echo $i

# While loop with invalid condition
while $x -lt 5
do
    echo $x
    x=$((x + 1))
done
