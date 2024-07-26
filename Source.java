import java.util.ArrayList;
import java.util.List;

public abstract class Source{
    private final List<MyObserver> list;

    public Source(){
        list = new ArrayList<>();
    }

    public final void register(MyObserver o){
        list.add(o);
    }

    public final void notifyObservers(){
        for(MyObserver o: list){
            o.update(this);
        }
    }
}