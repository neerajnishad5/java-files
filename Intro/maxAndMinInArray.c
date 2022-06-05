#include <stdio.h>
#include <conio.h>
#include <string.h>

int maxim(int *a, int s)
{
    int maxx = a[0];
    for (int i = 0; i < s; i++)
    {
        if (maxx < a[i])
        {

            maxx = a[i];
        }
    }
    return maxx;
}

int minim(int *a, int s)
{
    int mini = a[0];
    for (int i = 0; i < s; i++)
    {
        if (mini > a[i])
        {

            mini = a[i];
        }
    }
    return mini;
}
int main()
{

    int a[] = {55, 44, 33, 66, 112, 454, 323, 11, 222333, 666, 6767600, 123, 78, 98, 67, 453, 5};
    int size = sizeof(a) / sizeof(a[0]);

    int maxi = a[0];
    int mini = a[0];

    // for (int i = 0; i < size; i++)
    // {
    //     if (a[i] > maxi)
    //     {
    //         maxi = a[i];
    //     }
    // }

    // for (int i = 0; i < size; i++)
    // {
    //     if (a[i] < mini)
    //     {
    //         mini = a[i];
    //     }
    // }

    printf("Minimum value: %d Minimum value:  %d", minim(a, size),  maxim(a, size));
}