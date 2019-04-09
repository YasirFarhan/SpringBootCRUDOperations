package docker.com.example.dockerDemo.factory;

import docker.com.example.dockerDemo.Persistance.UserCassandraRepository;
import docker.com.example.dockerDemo.model.UserModel;
import docker.com.example.dockerDemo.tables.CassandraUsersTable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CassandraFactory implements DataBaseFactory {

    @Autowired
    private UserCassandraRepository dao;

    @Override
    public void saveRecord(UserModel newRecord) {
        CassandraUsersTable cassandraUsersTable = new CassandraUsersTable();
        cassandraUsersTable.convertFromUserModelToCassandraTable(newRecord);
        dao.save(cassandraUsersTable);
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
    public List<UserModel> findAllRecords() {
        System.out.println("****************************************************************" +
                "USING    Cassandra   IMPLIMENTATION");

        List userList = new ArrayList<UserModel>();
        Iterable<CassandraUsersTable> listOfUsers = dao.findAll();
        listOfUsers.forEach(userList::add);

        return userList;
    }
}