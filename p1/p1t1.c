#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool isValid(const char *str) {
    int len = strlen(str);

    if (len < 2) {
        return false;
    }

    if (str[len - 1] != 'b' || str[len - 2] != 'b') {
        return false;
    }

    for (int i = 0; i < len - 2; i++) {
        if (str[i] != 'a') {
            return false;
        }
    }

    return true;
}

int main() {
    char input[100];

    for(int i=0; i<9; i++){

    printf("Enter a string: ");
    scanf("%s", input);

    if (isValid(input)) {
        printf("The string is valid. \n");
    } else {
        printf("The string is invalid.\n");
    }

    }
    return 0;
}
