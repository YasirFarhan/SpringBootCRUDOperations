package docker.com.example.dockerDemo.dao;

import docker.com.example.dockerDemo.entity.SimpleTable;
import org.springframework.data.repository.CrudRepository;

public interface Dao extends CrudRepository<SimpleTable, Integer> {

/*
    void saveRecord(SimpleTable newRecord);

    List<SimpleTable> findAllRecords();

    void deleteRecordById(Integer id);

    Optional<SimpleTable> findRecordById(Integer id);

    */


}