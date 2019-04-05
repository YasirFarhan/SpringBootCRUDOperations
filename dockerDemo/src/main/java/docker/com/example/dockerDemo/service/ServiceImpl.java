package docker.com.example.dockerDemo.service;

import docker.com.example.dockerDemo.dao.Dao;
import docker.com.example.dockerDemo.entity.SimpleTable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Autowired
    private Dao dao;


    @Override
    public void save(SimpleTable newRecord) {
        dao.save(newRecord);
        dao.save(newRecord);
    }

    @Override
    public Optional<SimpleTable> findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public Iterable<SimpleTable> findAll() {
        return dao.findAll();
    }
}