package docker.com.example.dockerDemo.controller;

import docker.com.example.dockerDemo.dao.Dao;
import docker.com.example.dockerDemo.entity.SimpleTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class DemoController {
    @Autowired
    Dao dao;

    @GetMapping(path = "/findAll")
    @ResponseBody
    public List<SimpleTable> findAll() {
        return dao.findAll();
    }


    @GetMapping(path = "/find/{id}")
    @ResponseBody
    public Optional<SimpleTable> findById(@PathVariable("id") Integer id) {
        return dao.findById(id);
    }


    @PostMapping(path = "/save", headers = "Accept=application/json", produces = "application/json")
    @ResponseBody
    public void save(@RequestBody SimpleTable newRecord) {
        dao.save(newRecord);
    }
    @PutMapping(path = "/update", headers = "Accept=application/json", produces = "application/json")
    @ResponseBody
    public void update(@RequestBody SimpleTable newRecord) {
        dao.save(newRecord);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable("id") Integer id) {
        dao.deleteById(id);
    }
}

