package com.atqgh.springboot.common.exception;


import com.atqgh.springboot.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 22:33 2019/5/21
 * @Modified By:
 **/

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CommonException extends RuntimeException {
    private ExceptionEnum exceptionEnum;

}
