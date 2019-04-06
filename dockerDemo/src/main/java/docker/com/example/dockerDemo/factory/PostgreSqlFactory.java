package docker.com.example.dockerDemo.factory;

import docker.com.example.dockerDemo.Persistance.UserPostgresRepository;
import docker.com.example.dockerDemo.tables.CassandraUsersTable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PostgreSqlFactory implements DataBaseFactory {
    @Autowired
    UserPostgresRepository dao;

    @Override
    public void saveRecord(CassandraUsersTable newRecord) {
        dao.save(newRecord);
    }

    @Override
    public Optional<CassandraUsersTable> findRecordById(Integer id) {
        return dao.findById(Long.parseLong(id.toString()));
    }

    @Override
    public void deleteRecordById(Integer id) {
        dao.deleteById(Long.parseLong(id.toString()));
    }

    @Override
    public Iterable<CassandraUsersTable> findAllRecords() {


        System.out.println("****************************************************************" +
                "USING    SQL IMPLIMENTATION");
        Iterable<CassandraUsersTable> listOfUsers = dao.findAll();
        return dao.findAll();
    }
}
