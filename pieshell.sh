#!/bin/bash

# Define a variable
number=10

# Check if the number is greater than 5
if [ $number -gt 5 ]; then
    output="The number is greater than 5."
# Check if the number is equal to 5
elif [ $number -eq 5 ]; then
    output="The number is equal to 5."
# If none of the above conditions are true
else
    output="The number is less than 5."
fi

# Echo the output
echo "$output"
