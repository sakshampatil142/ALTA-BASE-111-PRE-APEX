#include <stdio.h>

void modifyByValue(int x) {
    x = x + 100;
}

void modifyByReference(int *x) {
    *x = *x + 100;
}

int main() {
    int a = 5;
    modifyByValue(a);
    printf("After modifyByValue: %d\n", a);

    int b = 5;
    modifyByReference(&b);
    printf("After modifyByReference: %d\n", b);

    return 0;
}