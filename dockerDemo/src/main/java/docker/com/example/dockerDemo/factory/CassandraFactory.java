package docker.com.example.dockerDemo.factory;

import docker.com.example.dockerDemo.Persistance.UserCassandraRepository;
import docker.com.example.dockerDemo.model.UserModel;
import docker.com.example.dockerDemo.tables.CassandraUsersTable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CassandraFactory implements DataBaseFactory {

    @Autowired
    private UserCassandraRepository dao;

    @Override
    public void saveRecord(CassandraUsersTable newRecord) {
        dao.save(newRecord);
    }

    @Override
    public UserModel findRecordById(Long id) {
        UserModel userModel = new UserModel();
        Optional<CassandraUsersTable> u = dao.findById(id);
        userModel.convertFromCassandraTable(u);
        return userModel;
    }

    @Override
    public void deleteRecordById(Integer id) {
//        dao.deleteById(id);
    }

    @Override
    public Iterable<CassandraUsersTable> findAllRecords() {

        System.out.println("****************************************************************" +
                "USING    NON SQL IMPLIMENTATION");

        Iterable<CassandraUsersTable> listOfUsers = dao.findAll();
        return dao.findAll();
    }
}