/**
 * Author:   Tang
 * Date:     2019/9/14 16:24
 * Description:
 */
package com.zzgs.springboot_demp01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:   Tang
 * Date:     2019/9/14 16:24
 * Description:
 */
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/index")
    public String index(){
        return "hello world  index!!";
    }
}
