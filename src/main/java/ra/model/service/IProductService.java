package ra.model.service;

import java.util.Optional;

public interface IProductService<T,E> {
    Iterable<T>  findAll ();
    Optional<T> findById(Long id);
    T save(T t);
    void  delete(E id);
}
