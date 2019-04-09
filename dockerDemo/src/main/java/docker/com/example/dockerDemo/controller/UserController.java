package docker.com.example.dockerDemo.controller;

import docker.com.example.dockerDemo.factory.DataBaseFactory;
import docker.com.example.dockerDemo.model.UserModel;
import docker.com.example.dockerDemo.tables.CassandraUsersTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    DataBaseFactory dataBaseFactory;

    @GetMapping(path = "/findAll")
    @ResponseBody
    public Iterable<CassandraUsersTable> findAll() {
        Iterable<CassandraUsersTable> list = dataBaseFactory.findAllRecords();
        return list;
    }

    @GetMapping(path = "/find/{id}")
    @ResponseBody
    public UserModel findById(@PathVariable("id") Long id) {
        return dataBaseFactory.findRecordById(id);
    }


    @PostMapping(path = "/save", headers = "Accept=application/json", produces = "application/json")
    public void save(@RequestBody CassandraUsersTable newRecord) {
        dataBaseFactory.saveRecord(newRecord);
    }

    @PutMapping(path = "/update", headers = "Accept=application/json", produces = "application/json")
    public void update(@RequestBody CassandraUsersTable newRecord) {
        dataBaseFactory.saveRecord(newRecord);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable("id") Integer id) {
        dataBaseFactory.deleteRecordById(id);
    }
}

