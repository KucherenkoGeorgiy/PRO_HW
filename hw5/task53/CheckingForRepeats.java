package com.hillel.kucherenko.hw5.task53;

public class CheckingForRepeats {
    int usersInput;

    public CheckingForRepeats(int usersInput) {
        this.usersInput = usersInput;
    }

    public boolean checkForRepeats() {
        boolean hasRepeats;
        int tempValue;

        hasRepeats = false;
        for (int i = usersInput; i > 10; i /= 10) {

            if (hasRepeats) {
                break;
            }
            tempValue = i % 10;
            for (int j = i / 10; j > 0; j /= 10) {
                if (tempValue == j % 10) {
                    hasRepeats = true;
                    break;
                }
            }
        }
        if (!hasRepeats) {
            return false;
        } else {
            return true;
        }
    }
}


