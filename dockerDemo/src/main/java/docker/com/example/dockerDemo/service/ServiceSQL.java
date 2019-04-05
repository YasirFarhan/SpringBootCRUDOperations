package docker.com.example.dockerDemo.service;

import docker.com.example.dockerDemo.dao.Dao;
import docker.com.example.dockerDemo.entity.SimpleTable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ServiceSQL implements Service {
    @Autowired
    Dao dao;

    @Override
    public void saveRecord(SimpleTable newRecord) {
        dao.save(newRecord);
    }

    @Override
    public Optional<SimpleTable> findRecordById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void deleteRecordById(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public Iterable<SimpleTable> findAllRecords() {


        System.out.println("****************************************************************" +
                "USING    SQL IMPLIMENTATION");

        return dao.findAll();
    }
}