#include <stdio.h>
int main() {
    __asm__ ( "movl $30, %eax;"
                    "movl $50, %ebx;"
                    "imull %ebx, %eax;"
    );
    __asm__ ( "movl $30, %eax;"
                "movl $50, %ebx;"
                "addl %ebx, %eax;"
    );
    return 0 ;
}
