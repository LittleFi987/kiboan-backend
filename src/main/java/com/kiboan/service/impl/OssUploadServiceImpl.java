package com.kiboan.service.impl;

import com.kiboan.core.AbstractService;
import com.kiboan.dao.OssUploadMapper;
import com.kiboan.model.OssUpload;
import com.kiboan.service.OssUploadService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/10/05.
 */
@Service
@Transactional
public class OssUploadServiceImpl extends AbstractService<OssUpload> implements OssUploadService {
    @Resource
    private OssUploadMapper ossUploadMapper;

}
