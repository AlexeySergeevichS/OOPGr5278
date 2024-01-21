package services;
import java.util.List;

public interface iPersonService<T> {
    List<T> getAll();
    void create(String name, int age);
}
