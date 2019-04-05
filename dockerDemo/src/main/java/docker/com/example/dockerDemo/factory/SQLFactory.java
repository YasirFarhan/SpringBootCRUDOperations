package docker.com.example.dockerDemo.factory;

import docker.com.example.dockerDemo.Persistance.CassandraDAO;
import docker.com.example.dockerDemo.tables.UsersTable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class SQLFactory implements DataBaseFactory {
    @Autowired
    CassandraDAO dao;

    @Override
    public void saveRecord(UsersTable newRecord) {
        dao.save(newRecord);
    }

    @Override
    public Optional<UsersTable> findRecordById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void deleteRecordById(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public Iterable<UsersTable> findAllRecords() {


        System.out.println("****************************************************************" +
                "USING    SQL IMPLIMENTATION");

        return dao.findAll();
    }
}
