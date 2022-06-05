#include <stdio.h>
#include <string.h>
#include <conio.h>

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

void bubbleSort(int a[], int s)
{
    for (int i = 0; i < s; i++)
    {
        for (int j = 0; j < s - i - 1; j++)
        {
            if (a[j] > a[j + 1])
            {
                swap(&a[j], &a[j + 1]);
            }
        }
    }
}
int kthSamllestEle(int a[], int s, int k)
{

    bubbleSort(a, s);

    return a[k - 1];
}
int main()
{

    int a[] = {5, 4, 3, 5121, 66, 212, 54, 65, 87, 98, 123, 456, 65432};
    int size = sizeof(a) / sizeof(a[0]);

    printf("kth smallest element: %d", kthSamllestEle(a, size, 2));
    printf("\n");
    bubbleSort(a, size);

    for (int i = 0; i < size; i++)
        printf("%d ", a[i]);
}