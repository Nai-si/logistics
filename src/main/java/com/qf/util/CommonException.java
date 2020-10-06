package com.qf.util;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/25 15:25
 * @Description: 全局异常处理类
 */
@RestControllerAdvice
public class CommonException {


    /**
     * 处理那些没有遇到的异常
     * @param ex
     * @return
     */
    @ExceptionHandler
    public JsonResult CommonException(Exception ex){
        return new JsonResult(0,ex.getMessage());
    }

}

