package com.pheonixIT.CursoMC.resources.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable {
    private static final long serialVersionUID = 1l;
    private Integer id;
    private String nome;

    public Categoria(){

    }

    public Categoria(Integer id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Categoria)) return false;
        Categoria categoria = (Categoria) o;
        return getId().equals(categoria.getId()) &&
                getNome().equals(categoria.getNome());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime  * result +((id == null) ? 0 : id.hashCode());
        return result;
    }
}
