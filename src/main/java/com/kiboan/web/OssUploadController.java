package com.kiboan.web;
import com.kiboan.core.Result;
import com.kiboan.core.ResultGenerator;
import com.kiboan.model.OssUpload;
import com.kiboan.service.OssUploadService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/10/05.
*/
@RestController
@RequestMapping("/oss/upload")
public class OssUploadController {
    @Resource
    private OssUploadService ossUploadService;

    @PostMapping("/add")
    public Result add(OssUpload ossUpload) {
        ossUploadService.save(ossUpload);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        ossUploadService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(OssUpload ossUpload) {
        ossUploadService.update(ossUpload);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        OssUpload ossUpload = ossUploadService.findById(id);
        return ResultGenerator.genSuccessResult(ossUpload);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<OssUpload> list = ossUploadService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
