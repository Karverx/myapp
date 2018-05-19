package ru.levelp.myapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.levelp.myapp.dao.PartsDAO;
import ru.levelp.myapp.model.Part;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class IndexBean {
    private final EntityManager em;
    private final PartsDAO dao;

    public IndexBean(EntityManager em) {
        this.em = em;
        dao = new PartsDAO(em);
    }

    public List<Part> getParts() {
        return new PartsDAO(em).findAllParts();
    }
}