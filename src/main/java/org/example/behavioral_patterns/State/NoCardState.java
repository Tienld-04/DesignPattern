package org.example.behavioral_patterns.State;

//ConcreteState: State 1: Không có thẻ
class NoCardState implements ATMState {
    private ATMMachine context;

    public NoCardState(ATMMachine context) {
        this.context = context;
    }

    @Override
    public void insertCard() {
        System.out.println("Đã nhận thẻ");
        context.setState(new HasCardState(context));
    }

    @Override
    public void ejectCard() {
        System.out.println("Không có thẻ để rút");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Vui lòng đưa thẻ vào trước");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Vui lòng đưa thẻ vào trước");
    }
}
