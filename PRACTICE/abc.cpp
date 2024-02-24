#include <iostream>
#include <fstream>
using namespace std;
void writing()
{
    // way of writing data in file
    ofstream fout;
    fout.open("file_2.txt", ios::app);
    fout << "hallo";
    fout.close();
}

int main()
{
    // way of reading data from file
    char ch;
    ifstream fin;

    //fin is object of ifstream we can put any name instead of fin/
    fin.open("file_2.txt", ios::in); //open is differnt-different in fout and fin and if we not write open mode then it open in "in" mode automatically/
    //cin is use to tke data from keyboard same way fin is object of ifstream is used to reading file/
     fin >> ch; //this is way to read data from file but it can print only one character so we use loop to print all character/
    while(!fin.eof()) //fin.eof() return true at the end of file, but while is stop at false condition we use !(not) which means when condition is not true or when false then while is stop/
    {
        cout << ch;
        fin >> ch; // This is use to read file data
    }
    fin.close(); //It is use to close file/
    return 0;
}