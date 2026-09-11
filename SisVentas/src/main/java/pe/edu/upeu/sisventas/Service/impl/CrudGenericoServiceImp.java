package pe.edu.upeu.sisventas.Service.impl;

import pe.edu.upeu.sisventas.Service.ICrudGenericoService;
import pe.edu.upeu.sisventas.exception.ModelNotFoundException;
import pe.edu.upeu.sisventas.repository.ICrudGenericoRepository;

import java.util.List;

public abstract class CrudGenericoServiceImp <T, ID> implements ICrudGenericoService<T,ID> {
    protected abstract ICrudGenericoRepository<T, ID> getRepo();

    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Override
    public T update(ID id, T t) {
        if (getRepo().existsById(id)){
            throw new ModelNotFoundException("Id no existe: " + id);
        }
        return getRepo().update(t);
    }

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) {
        return getRepo().findById(id).orElseThrow(()-> new ModelNotFoundException("El ID no existe: " + id));
    }

    @Override
    public void delete(ID id) {
        if (getRepo().existsById(id)){
            throw new ModelNotFoundException("Id no existe: " + id);
        }

    }
}
