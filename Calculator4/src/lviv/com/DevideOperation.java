package lviv.com;

public final class DevideOperation implements Operation {

    int firstNum;
    int secondNum;

    DevideOperation (int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public int getResult() {
        // TODO Auto-generated method stub
        return firstNum / secondNum;
    }

}
