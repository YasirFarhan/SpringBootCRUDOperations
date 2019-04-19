//package docker.com.example.dockerDemo.factory;
//
//import docker.com.example.dockerDemo.Persistance.UserPostgresRepository;
//import docker.com.example.dockerDemo.model.UserModel;
//import docker.com.example.dockerDemo.tables.PostgresUsersTable;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//public class PostgreFactory implements UsersDAO {
//    @Autowired
//    UserPostgresRepository dao;
//
//    @Override
//    public void saveRecord(UserModel newRecord) {
//        PostgresUsersTable postgresUsersTable = new PostgresUsersTable();
//        postgresUsersTable.convertFromUserModelToPostgresTable(newRecord);
//        dao.save(postgresUsersTable);
//    }
//
//    @Override
//    public UserModel findRecordById(Long id) {
//        UserModel userModel = new UserModel();
//        Optional userTable = dao.findById(id);
//        userModel.convertFromPostgresTable(userTable);
//        return userModel;
//    }
//
//
//    @Override
//    public void deleteRecordById(Long id) {
//        dao.deleteById(id);
//    }
//
//    @Override
//    public List<UserModel> findAllRecords() {
//        System.out.println("**************************************************************** USING    POSTGRESQL   IMPLIMENTATION   ****************************************************************");
//
//        List userList = new ArrayList<UserModel>();
//        Iterable<PostgresUsersTable> listOfUsers = dao.findAll();
//        listOfUsers.forEach(userList::add);
//        return userList;
//    }
//}
