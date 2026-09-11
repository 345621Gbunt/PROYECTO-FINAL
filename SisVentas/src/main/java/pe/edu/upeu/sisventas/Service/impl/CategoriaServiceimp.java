package pe.edu.upeu.sisventas.Service.impl;

import pe.edu.upeu.sisventas.Service.ICategoriaService;
import pe.edu.upeu.sisventas.model.Categoria;
import pe.edu.upeu.sisventas.repository.CategoriaRepository;
import pe.edu.upeu.sisventas.repository.ICrudGenericoRepository;

public class CategoriaServiceimp extends CrudGenericoServiceImp<Categoria, Long> implements ICategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceimp(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    protected ICrudGenericoRepository<Categoria, Long> getRepo() {
        return null;
    }
}
