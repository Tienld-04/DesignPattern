package org.example.behavioral_patterns.State;
// Context - ATM Machine
class ATMMachineContext {
    private ATMState currentState;

    public ATMMachineContext() {
        currentState = new NoCardState(this);
    }

    public void setState(ATMState state) {
        this.currentState = state;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin(pin);
    }

    public void withdrawCash(int amount) {
        currentState.withdrawCash(amount);
    }
}