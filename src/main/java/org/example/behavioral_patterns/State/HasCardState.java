package org.example.behavioral_patterns.State;

//ConcreteState: State 2: Có thẻ
class HasCardState implements ATMState {
    private ATMMachine context;

    public HasCardState(ATMMachine context) {
        this.context = context;
    }

    @Override
    public void insertCard() {
        System.out.println("Thẻ đã có trong máy rồi");
    }

    @Override
    public void ejectCard() {
        System.out.println("Đã trả thẻ");
        context.setState(new NoCardState(context));
    }

    @Override
    public void enterPin(int pin) {
        if (pin == 1234) {
            System.out.println("PIN chính xác");
            context.setState(new AuthenticatedState(context));
        } else {
            System.out.println("PIN sai, vui lòng thử lại");
        }
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Vui lòng nhập PIN trước");
    }
}