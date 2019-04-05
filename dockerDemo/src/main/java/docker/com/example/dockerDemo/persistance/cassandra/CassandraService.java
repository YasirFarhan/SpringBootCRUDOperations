package docker.com.example.dockerDemo.persistance.cassandra;

import docker.com.example.dockerDemo.entity.SimpleTable;
import docker.com.example.dockerDemo.persistance.FactoryInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CassandraService implements FactoryInterface {

@Autowired
    CassandraDAO2 cassandraDAO2;


    @Override
    public Iterable<SimpleTable> findAllUsers() {
        return cassandraDAO2.findAll();
    }
}
