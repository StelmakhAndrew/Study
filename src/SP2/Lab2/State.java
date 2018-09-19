package SP2.Lab2;

public class State {
    private int Itr;
    private int dlm;
    State(int Itr , int dlm){
        this.Itr = Itr;
        this.dlm = dlm;
    }
    public int getItr() {
        return Itr;
    }

    public int getDlm() {
        return dlm;
    }
}