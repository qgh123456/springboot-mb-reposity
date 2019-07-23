package com.atqgh.springboot.common.advice;

import com.atqgh.springboot.common.entity.ExceptionResult;
import com.atqgh.springboot.common.exception.CommonException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 22:14 2019/5/21
 * @Modified By:
 **/
//@Slf4j
@ControllerAdvice  //默认拦截所有的所有@RequestMapping注解的方法
public class CommonExceptionHandler {

    @ExceptionHandler(CommonException.class)
    public ResponseEntity<ExceptionResult> handleException2(CommonException ex){
        ResponseEntity<ExceptionResult> resultResponseEntity = ResponseEntity.status(ex.getExceptionEnum().getCode())
                .body(new ExceptionResult(ex.getExceptionEnum()));
        System.out.println(resultResponseEntity);
        return resultResponseEntity;
    }

}
