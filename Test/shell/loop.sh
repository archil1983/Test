#!/usr/bin/env bash

MAX_NUMBER=$1
for (( VAR = 1; VAR < ${MAX_NUMBER}; VAR++ ))
do
 echo ${VAR}
done

echo "FOR loop finished"
