package com.sumeyyeakay.controller;

import com.sumeyyeakay.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = "User Api documentation")
public class UserController
{
    private final List<User> userList = new ArrayList<>();

    //classin const calistiktan sonra bu metod calissin.
    @PostConstruct
    public void init()
    {
        userList.add(new User(1,"sumeyyeakay", "sumeyye",
                "akay", "sumeyyeakayy@gmail.com", new Date()));
    }

    @PostMapping
    @ApiOperation(value = "New User adding method")
    public ResponseEntity<User> save(@RequestBody User user) {
        userList.add(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    @ApiOperation(value = "User list method")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userList);
    }
}
