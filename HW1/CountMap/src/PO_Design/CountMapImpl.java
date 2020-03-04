package PO_Design;

import java.util.HashMap;
import java.util.Map;

public class CountMapImpl<E> implements CountMap<E>{
    private final Map<E, Integer> SourceMap;

    public CountMapImpl() {
        this.SourceMap = new HashMap<>();
    }

    @Override
    public void add(E o) {
        Integer Counter = SourceMap.getOrDefault(o, -1);
        if (Counter == -1) {
            SourceMap.put(o, 1);
        } else {
            SourceMap.replace(o, ++Counter);
        }
    }

    @Override
    public int getCount(E o) {
        return SourceMap.getOrDefault(o, -1);
    }

    @Override
    public int remove(E o) {
        return SourceMap.remove(o);
    }

    @Override
    public int size() {
        return SourceMap.size();
    }

    @Override
    public void addAll(CountMap<? extends E> source) {
        for (E o : source.toMap().keySet()) {
            SourceMap.put(o, SourceMap.get(o) + source.toMap().get(o));
        }
    }

    @Override
    public Map<E, Integer> toMap() {
        return SourceMap;
    }

    @Override
    public void toMap(Map<? super E, Integer> destination) {
        destination.putAll(SourceMap);
    }
}
