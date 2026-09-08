package pe.edu.upeu.sysventas.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class AbstractJpaRepository<T, ID>
        implements ICrudGenericoRepository<T,ID>{
   protected final List<T> data=new ArrayList<>();
   protected abstract ID getId(T entity);
   protected abstract void setId(T entity, ID id);
   protected abstract ID generateID();

    @Override
    public T save(T entity) {
        return null;
    }

    @Override
    public T update(T entity) {
        ID id=getId(entity);
        for ( int i=0; i<data.size(); i++) {
            T item=data.get(i);
            if (data.get(i).equals(id)) {
                data.set(i,entity);
                return entity;
            }
        }
        throw new RuntimeException("No se encontro la entidad con el ID:");
    }

    @Override
    public Optional<T> findById(ID intity) {
        return data.stream()
                .filter(i->i.equals(intity))
                .findFirst();
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(data);
    }

    @Override
    public Void deleteById(ID id) {
        data.remove(T entity->getId(entity).equals(AD);
    }

    @Override
    public boolean existsById(ID id) {
        return false;
    }
}
