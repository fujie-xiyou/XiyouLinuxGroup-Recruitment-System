package org.xiyoulinux.recruitment.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xiyoulinux.recruitment.model.po.Join;
import org.xiyoulinux.recruitment.service.SignService;
import org.xiyoulinux.recruitment.untils.*;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;


@Controller
@ResponseBody
public class SignUpNewController {
    @Autowired
    private SignService signService;

    @RequestMapping(value = "/signUpNew", method = RequestMethod.POST)
    public ResponseResult signUp(HttpServletRequest request ,@RequestParam(value = "mobile") String mobile) {
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return signService.signUp(request,mobile);

    }
    @RequestMapping(value = "/checkUser",method = RequestMethod.POST)
    public ResponseResult checkUser(HttpServletRequest request ,@RequestBody Join join ){
        return signService.checkUser(request,join);
    }
}
