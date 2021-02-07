//package com.vikram;
//
//public class SwapNumbers {
//
//    void swapNums(int &x, int &y) {
//        //here &x and &y are pointing to 10 and 20 respectively .
//        int z = x;
//        x = y;
//        y = z;
//        //After this swap &x and &y are pointing to 20 and 10 respectively .
//        //Also firstNum and secondNum are pointing to 20 and 10 respectively .
//    }
//
//    int main() {
//        int firstNum = 10;//here firstNum is pointing to 10
//        int secondNum = 20;//secondNum is pointing to 20
//
//        cout << "Before swap: " << "\n";
//        cout << firstNum << secondNum << "\n"; //this will print 10 and 20 .
//
//        // Call the function, which will change the values pointed by firstNum and secondNum
//        swapNums(firstNum, secondNum);
//
//        cout << "After swap: " << "\n";
//        cout << firstNum << secondNum << "\n";//this will print 20 and 10 .
//
//        return 0;
//    }
//
//}
//
