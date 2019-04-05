package docker.com.example.dockerDemo.controller;

import docker.com.example.dockerDemo.entity.SimpleTable;
import docker.com.example.dockerDemo.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DemoController {
    @Autowired
    User service;

    @GetMapping(path = "/findAll")
    @ResponseBody
    public Iterable<SimpleTable> findAll() {
        Iterable<SimpleTable> list = service.findAllRecords();
        return list;
    }

    @GetMapping(path = "/find/{id}")
    @ResponseBody
    public Optional<SimpleTable> findById(@PathVariable("id") Integer id) {
        return service.findRecordById(id);
    }


    @PostMapping(path = "/save", headers = "Accept=application/json", produces = "application/json")
    public void save(@RequestBody SimpleTable newRecord) {
        service.saveRecord(newRecord);
    }

    @PutMapping(path = "/update", headers = "Accept=application/json", produces = "application/json")
    public void update(@RequestBody SimpleTable newRecord) {
        service.saveRecord(newRecord);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable("id") Integer id) {
        service.deleteRecordById(id);
    }
}

