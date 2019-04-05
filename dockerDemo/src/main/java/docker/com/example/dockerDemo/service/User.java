package docker.com.example.dockerDemo.service;

import docker.com.example.dockerDemo.entity.SimpleTable;

import java.util.List;
import java.util.Optional;

public interface User {
    void saveRecord(SimpleTable newRecord);

    Optional<SimpleTable> findRecordById(Integer id);

    void deleteRecordById(Integer id);

    Iterable <SimpleTable> findAllRecords();
}
