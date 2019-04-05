package docker.com.example.dockerDemo.persistance;

import docker.com.example.dockerDemo.entity.SimpleTable;

import java.util.List;

public interface FactoryInterface {

    public List<SimpleTable> findAllUsers();
}
