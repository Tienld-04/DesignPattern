package org.example.behavioral_patterns.State;

// ConcreteState : State 3: Đã xác thực
class AuthenticatedState implements ATMState {
    private ATMMachine context;

    public AuthenticatedState(ATMMachine context) {
        this.context = context;
    }

    @Override
    public void insertCard() {
        System.out.println("Thẻ đã có trong máy rồi");
    }

    @Override
    public void ejectCard() {
        System.out.println("Giao dịch hoàn tất, đã trả thẻ");
        context.setState(new NoCardState(context));
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Đã xác thực rồi");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Rút " + amount + "đ thành công");
    }
}
