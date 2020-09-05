package com.sumeyyeakay.controller;

import com.sumeyyeakay.model.Path;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/path")
@Api(value = "Path Api documentation")
public class PathController
{
    private final List<Path> pathList = new ArrayList<>();

    //classin const calistiktan sonra bu metod calissin.
    @PostConstruct
    public void init()
    {
        pathList.add(new Path(1,"Test Path", new Date()));
    }

    @PostMapping
    @ApiOperation(value = "New Path adding method")
    public ResponseEntity<Path> save(@RequestBody Path path ) {
        pathList.add(path);
        return ResponseEntity.ok(path);
    }

    @GetMapping
    @ApiOperation(value = "Path list method")
    public ResponseEntity<List<Path>> getAll() {
        return ResponseEntity.ok(pathList);
    }
}
