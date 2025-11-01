package org.example.behavioral_patterns.State;
// State Interface
interface ATMState {
    void insertCard();
    void ejectCard();
    void enterPin(int pin);
    void withdrawCash(int amount);
}