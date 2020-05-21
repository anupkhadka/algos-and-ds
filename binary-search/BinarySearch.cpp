/* This program implements both recursive and iterative
 * binary search on a sorted integer array
 */

#include <iostream>
using namespace std;

/* Perform binary search recursively */
bool binarySearchRecursive(int arr[], int key, int lowerBound, int upperBound) 
{
    int position = (lowerBound + upperBound)/2;

    if(lowerBound > upperBound) {
        return false;
    } else if(arr[position] == key) {
        return true;
    } else if(arr[position] > key) {
        return binarySearchRecursive(arr, key, lowerBound, position - 1);
    } else {
        return binarySearchRecursive(arr, key, position + 1, upperBound);
    }
}

/* Perform binary search iteratively */
bool binarySearchIterative(int arr[], int key, int lowerBound, int upperBound) 
{
    int position = (lowerBound + upperBound)/2;
    while(arr[position] != key && lowerBound <= upperBound) {
        if(arr[position] > key) {
            upperBound = position - 1;
        } else {
            lowerBound = position + 1;
        }
        position = (lowerBound + upperBound)/2;
    }

    return lowerBound <= upperBound;
}

void printArray(int arr[], int arrLength) 
{
    int i; 
    for(i = 0; i < arrLength; i++) {
        cout<<arr[i]<<" ";
    }
}

int main(int argc, char *argv[]) 
{
    int arr [] = {1,3,4,4,5,7,9};
    int arrLength = sizeof(arr)/sizeof(arr[0]);
    int lowerBound = 0;
    int upperBound = arrLength - 1;
    int arrToTest [] = {-45, 0, 4, 9, 100};
    int arrToTestLength = sizeof(arrToTest)/sizeof(arrToTest[0]);
    int i;
    
    cout<<endl;
    cout<<"Binary search recursive test on array:";
    printArray(arr, arrLength);
    cout<<endl;
    for(i = 0; i < arrToTestLength; i++) {
        if(binarySearchRecursive(arr, arrToTest[i], lowerBound, upperBound)) {
            cout<<arrToTest[i]<<" is found"<<endl;
        } else {
            cout<<arrToTest[i]<<" is not found"<<endl;
        }
    } 
    
    cout<<endl;
    cout<<"Binary search iterative test on array:";
    printArray(arr, arrLength);
    cout<<endl;
    for(i = 0; i < arrToTestLength; i++) {
        if(binarySearchIterative(arr, arrToTest[i], lowerBound, upperBound)) {
            cout<<arrToTest[i]<<" is found"<<endl;
        } else {
            cout<<arrToTest[i]<<" is not found"<<endl;
        }
    } 
}
