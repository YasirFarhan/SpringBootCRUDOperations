package docker.com.example.dockerDemo.controller;

import docker.com.example.dockerDemo.factory.DataBaseFactory;
import docker.com.example.dockerDemo.tables.UsersTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    DataBaseFactory dataBaseFactory;

    @GetMapping(path = "/findAll")
    @ResponseBody
    public Iterable<UsersTable> findAll() {
        Iterable<UsersTable> list = dataBaseFactory.findAllRecords();
        return list;
    }

    @GetMapping(path = "/find/{id}")
    @ResponseBody
    public Optional<UsersTable> findById(@PathVariable("id") Integer id) {
        return dataBaseFactory.findRecordById(id);
    }


    @PostMapping(path = "/save", headers = "Accept=application/json", produces = "application/json")
    public void save(@RequestBody UsersTable newRecord) {
        dataBaseFactory.saveRecord(newRecord);
    }

    @PutMapping(path = "/update", headers = "Accept=application/json", produces = "application/json")
    public void update(@RequestBody UsersTable newRecord) {
        dataBaseFactory.saveRecord(newRecord);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable("id") Integer id) {
        dataBaseFactory.deleteRecordById(id);
    }
}

