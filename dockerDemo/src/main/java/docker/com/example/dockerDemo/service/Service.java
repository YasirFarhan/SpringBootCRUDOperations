package docker.com.example.dockerDemo.service;

import docker.com.example.dockerDemo.entity.SimpleTable;

import java.util.List;
import java.util.Optional;

public interface Service {
    void save(SimpleTable newRecord);

    Optional<SimpleTable> findById(Integer id);

    void deleteById(Integer id);

    Iterable <SimpleTable> findAll();
}
