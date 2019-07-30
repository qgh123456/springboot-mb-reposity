package com.atqgh.springboot.common.entity;

import com.atqgh.springboot.common.enums.ExceptionEnum;
import lombok.Data;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * @author bystander
 * @date 2018/9/15
 *
 * 自定义异常结果类
 */
@Data
public class ExceptionResult {

    private int status;
    private String message;
//    private long timestamp;
    private String timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.message = em.getMsg();
//        this.timestamp = System.currentTimeMillis();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("", Locale.SIMPLIFIED_CHINESE);
        simpleDateFormat.applyPattern("yyyy/MM/dd HH:mm:ss");
        timestamp = simpleDateFormat.format(System.currentTimeMillis());
//        System.out.println(simpleDateFormat.format(System.currentTimeMillis()));
    }
}
