package docker.com.example.dockerDemo.factory;

import docker.com.example.dockerDemo.Persistance.UserPostgresRepository;
import docker.com.example.dockerDemo.model.UserModel;
import docker.com.example.dockerDemo.tables.PostgresUserTable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PostgreSqlFactory implements DataBaseFactory {
    @Autowired
    UserPostgresRepository dao;

    @Override
    public void saveRecord(UserModel newRecord) {
        PostgresUserTable postgresUserTable = new PostgresUserTable();
        postgresUserTable.convertFromUserModelToPostgresTable(newRecord);
        dao.save(postgresUserTable);
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
    public List<UserModel> findAllRecords() {
        System.out.println("****************************************************************" +
                "USING    POSTGRESQL   IMPLIMENTATION");

        List userList = new ArrayList<UserModel>();
        Iterable<PostgresUserTable> listOfUsers = dao.findAll();
        listOfUsers.forEach(userList::add);
        return userList;
    }
}
