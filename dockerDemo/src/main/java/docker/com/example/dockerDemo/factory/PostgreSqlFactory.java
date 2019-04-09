package docker.com.example.dockerDemo.factory;

import docker.com.example.dockerDemo.Persistance.UserPostgresRepository;
import docker.com.example.dockerDemo.model.UserModel;
import docker.com.example.dockerDemo.tables.CassandraUsersTable;
import docker.com.example.dockerDemo.tables.PostgresUserTable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PostgreSqlFactory implements DataBaseFactory {
    @Autowired
    UserPostgresRepository dao;

    @Override
    public void saveRecord(CassandraUsersTable newRecord) {
//        dao.save(newRecord);
    }

    @Override
    public UserModel findRecordById(Long id) {
        UserModel userModel = new UserModel();
        Optional userTable = dao.findById(id);
        userModel.convertFromPostgresTable(userTable);
        return userModel;
    }


    @Override
    public void deleteRecordById(Integer id) {
        dao.deleteById(Long.parseLong(id.toString()));
    }

    @Override
    public Iterable<CassandraUsersTable> findAllRecords() {


        System.out.println("****************************************************************" +
                "USING    SQL IMPLIMENTATION");
        Iterable<PostgresUserTable> listOfUsers = dao.findAll();

//        return dao.findAll();
        return null;
    }
}
