#include <iostream>
using namespace std;
void printArray(int array[],int size){
    for (int i=0;i<size;i++){
        cout<<array[i]<<" ";
    }
    cout<<endl;
}
void mySort(int array[],int size){
    for (int i=1;i<size;i++){
        for (int j=0;j<i;j++){
            if (array[i]<array[j]){
                swap(array[i],array[j]);
            }
        }
    }
    cout<<endl;
}
void bubbleSort(int array[], int size) {
        for (int step = 0; step < (size-1); step++) {
            int swapped = 0;
            for (int i = 0; i < (size-step-1); i++) {
                if (array[i] > array[i + 1]) {
                    swap(array[i],array[i+1]);
                    swapped += 1;
                }
            }
            if (swapped == 0)
                break;
        }
        cout<<endl;
    }
bool isSorted(int array[],int size){
    if (size == 0 || size == 1){
        return true;
    }
    for (int i=0;i<=size-2;i++){
        if((array[i]>array[i+1])){
            cout<<endl;
            return false;
        }
    }
    return true;
}
int main(){
   cout<<"Enter the length of array you want to make: ";
   int length;
   cin>>length;
   int array[length];
   for (int i=0;i<length;i++){
       int val;
       cout<<"Enter value: ";
       cin>>val;
       array[i] = val;
   }
    printArray(array,length);
    cout<<isSorted(array,length);
//    mySort(array,length);
    bubbleSort(array,length);
    printArray(array,length);
    cout<<isSorted(array,length);


    return 0;
}