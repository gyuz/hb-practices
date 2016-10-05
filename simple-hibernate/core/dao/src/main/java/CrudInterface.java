package simple.core.dao;

import java.util.List;

public interface CrudInterface <T> {
    public void persists(T t);
    //public void update(T t);
    //public void delete(int idx, T t);
    //public List<T> loadAll();
}
