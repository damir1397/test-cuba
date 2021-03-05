package com.company.testcuba.rest

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/rest/users")
class RestController {

    @PostMapping("/login")
    fun userLogin(
            req: HttpServletRequest
    ) {

    }

}