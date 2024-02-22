public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean setTakeOrder) {
        super.isTakeOrder = super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public String getName() {
        return super.name;
    }
    
}
