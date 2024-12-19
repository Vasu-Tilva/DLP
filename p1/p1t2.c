#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool isValid(const char *str) {
    int len = strlen(str);


    if (len < 3) {
        return false;
    }


    if (str[len - 1] != 'b' || str[len - 2] != 'b') {
        return false;
    }


    bool foundA = false;
    for (int i = 0; i < len - 2; i++) {
        if (str[i] != 'a') {
            return false;
        }
        foundA = true;
    }

    return foundA;
}

int main() {
    char input[100];

    printf("Enter a string: ");
    scanf("%s", input);

    if (isValid(input)) {
        printf("The string is valid.\n");
    } else {
        printf("The string is invalid.\n");
    }

    return 0;
}
