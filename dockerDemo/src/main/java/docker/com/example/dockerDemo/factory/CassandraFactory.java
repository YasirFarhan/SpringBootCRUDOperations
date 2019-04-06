package docker.com.example.dockerDemo.factory;

import docker.com.example.dockerDemo.Persistance.UserCassandraRepository;
import docker.com.example.dockerDemo.tables.CassandraUsersTable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

//@org.springframework.stereotype.DataBaseFactory
public class CassandraFactory implements DataBaseFactory {

    @Autowired
    private UserCassandraRepository dao;

    @Override
    public void saveRecord(CassandraUsersTable newRecord) {
        dao.save(newRecord);
    }


    @Override
    public Optional<CassandraUsersTable> findRecordById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void deleteRecordById(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public Iterable<CassandraUsersTable> findAllRecords() {

        System.out.println("****************************************************************" +
                "USING    NON SQL IMPLIMENTATION");
        return dao.findAll();
    }
}