package docker.com.example.dockerDemo;

import docker.com.example.dockerDemo.factory.UsersDAO;
import docker.com.example.dockerDemo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UsersDAO usersDAO;

    @GetMapping(path = "/findAll")
    @ResponseBody
    public List<UserModel> findAll() {
        return usersDAO.findAllRecords();
    }

    @GetMapping(path = "/find/{id}")
    @ResponseBody
    public UserModel findById(@PathVariable("id") Long id) {
        return usersDAO.findRecordById(id);
    }


    @PostMapping(path = "/save", headers = "Accept=application/json", produces = "application/json")
    public void save(@RequestBody UserModel newRecord) {
        usersDAO.saveRecord(newRecord);
    }

    @PutMapping(path = "/update", headers = "Accept=application/json", produces = "application/json")
    public void update(@RequestBody UserModel newRecord) {
        usersDAO.saveRecord(newRecord);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable("id") Long id) {
        usersDAO.deleteRecordById(id);
    }
}

